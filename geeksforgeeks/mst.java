class Solution:
    def secondMST(self, V, edges):
        """
        Find the weight of the second best minimum spanning tree.
        
        Approach:
        1. Find the MST using Kruskal's algorithm
        2. For each edge in MST, temporarily remove it and find MST without it
        3. Return the minimum weight among all such MSTs that is greater than original MST
        """
        
        class UnionFind:
            def __init__(self, n):
                self.parent = list(range(n))
                self.rank = [0] * n
            
            def find(self, x):
                if self.parent[x] != x:
                    self.parent[x] = self.find(self.parent[x])
                return self.parent[x]
            
            def union(self, x, y):
                px, py = self.find(x), self.find(y)
                if px == py:
                    return False
                if self.rank[px] < self.rank[py]:
                    px, py = py, px
                self.parent[py] = px
                if self.rank[px] == self.rank[py]:
                    self.rank[px] += 1
                return True
        
        def kruskal(excluded_edge=None):
            """
            Run Kruskal's algorithm, optionally excluding one edge.
            Returns (weight, mst_edges) or (None, None) if no spanning tree exists.
            """
            uf = UnionFind(V)
            total_weight = 0
            mst_edges = []
            edge_count = 0
            
            for i, (u, v, w) in enumerate(sorted_edges):
                # Skip the excluded edge
                if excluded_edge is not None and i == excluded_edge:
                    continue
                
                if uf.union(u, v):
                    total_weight += w
                    mst_edges.append(i)
                    edge_count += 1
                    
                    if edge_count == V - 1:
                        return total_weight, mst_edges
            
            return None, None
        
        # Sort edges by weight
        sorted_edges = sorted(edges, key=lambda x: x[2])
        
        # Find the first MST
        mst_weight, mst_edges = kruskal()
        
        if mst_weight is None:
            return -1
        
        # Try removing each edge from MST one at a time
        second_best = float('inf')
        
        for excluded_idx in mst_edges:
            alt_weight, _ = kruskal(excluded_edge=excluded_idx)
            
            if alt_weight is not None and alt_weight > mst_weight:
                second_best = min(second_best, alt_weight)
        
        return second_best if second_best != float('inf') else -1


# Ready to submit to GeeksforGeeks