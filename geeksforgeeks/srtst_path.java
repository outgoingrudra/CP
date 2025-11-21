import java.util.*;

class Solution {
    public int shortestPath(int V, int a, int b, int[][] edges) {
        // Build adjacency list
        // Each entry: [neighbor, straightWeight, curvedWeight]
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            int x = edge[0], y = edge[1], w1 = edge[2], w2 = edge[3];
            graph.get(x).add(new int[]{y, w1, w2});
            graph.get(y).add(new int[]{x, w1, w2});
        }
        
        // dist[v][used] = shortest distance to vertex v with 'used' curved edges used
        int[][] dist = new int[V][2];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        // Priority queue: [distance, vertex, usedCurved]
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> x[0] - y[0]);
        
        dist[a][0] = 0;
        pq.offer(new int[]{0, a, 0});
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int d = curr[0], u = curr[1], used = curr[2];
            
            // Skip if we've found a better path already
            if (d > dist[u][used]) continue;
            
            for (int[] edge : graph.get(u)) {
                int v = edge[0], w1 = edge[1], w2 = edge[2];
                
                // Option 1: Take straight edge
                int newDist = d + w1;
                if (newDist < dist[v][used]) {
                    dist[v][used] = newDist;
                    pq.offer(new int[]{newDist, v, used});
                }
                
                // Option 2: Take curved edge (only if we haven't used one yet)
                if (used == 0) {
                    newDist = d + w2;
                    if (newDist < dist[v][1]) {
                        dist[v][1] = newDist;
                        pq.offer(new int[]{newDist, v, 1});
                    }
                }
            }
        }
        
        int result = Math.min(dist[b][0], dist[b][1]);
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}