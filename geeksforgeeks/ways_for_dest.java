import java.util.*;

class Solution {
    public int countPaths(int V, int[][] edges) {
        List<List<int[]>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            adj.get(u).add(new int[]{v, w});
            adj.get(v).add(new int[]{u, w});
        }
        
        long[] dist = new long[V];
        Arrays.fill(dist, Long.MAX_VALUE / 2);
        dist[0] = 0;
        
        long[] ways = new long[V];
        ways[0] = 1;
        
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        pq.offer(new long[]{0, 0});
        
        while (!pq.isEmpty()) {
            long[] front = pq.poll();
            long d = front[0];
            int u = (int) front[1];
            if (d > dist[u]) continue;
            
            for (int[] nei : adj.get(u)) {
                int v = nei[0];
                long w = nei[1];
                long nd = d + w;
                if (nd < dist[v]) {
                    dist[v] = nd;
                    ways[v] = ways[u];
                    pq.offer(new long[]{nd, v});
                } else if (nd == dist[v]) {
                    ways[v] += ways[u];
                }
            }
        }
        
        return (int) (dist[V - 1] == Long.MAX_VALUE / 2 ? 0 : ways[V - 1]);
    }
}