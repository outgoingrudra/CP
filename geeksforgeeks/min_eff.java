import java.util.*;

class Solution {
    public int minCostPath(int[][] mat) {
        int n = mat.length, m = mat[0].length;

    
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        int[][] dist = new int[n][m];
        for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);
        dist[0][0] = 0;

        pq.offer(new int[]{0, 0, 0}); 

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int cost = curr[0], x = curr[1], y = curr[2];

            if (x == n - 1 && y == m - 1) return cost;

            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    int edgeCost = Math.abs(mat[x][y] - mat[nx][ny]);
                    int newCost = Math.max(cost, edgeCost);

                    if (newCost < dist[nx][ny]) {
                        dist[nx][ny] = newCost;
                        pq.offer(new int[]{newCost, nx, ny});
                    }
                }
            }
        }
        return -1; 
    }
}
