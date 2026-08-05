import java.util.*;

class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
       
        List<List<Integer>> edge = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edge.add(new ArrayList<>());
        }
        for (int[] inv : invocations) {
            edge.get(inv[0]).add(inv[1]);
        }

     
        boolean[] visited = new boolean[n];
        List<Integer> suspicious = new ArrayList<>();
        dfs(edge, suspicious, visited, k);

        Set<Integer> suspiciousSet = new HashSet<>(suspicious);

       
        for (int i = 0; i < n; i++) {
            if (suspiciousSet.contains(i)) continue;
            for (int nei : edge.get(i)) {
                if (suspiciousSet.contains(nei)) {
                    List<Integer> all = new ArrayList<>();
                    for (int j = 0; j < n; j++) all.add(j);
                    return all;
                }
            }
        }

        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!suspiciousSet.contains(i)) result.add(i);
        }
        return result;
    }

    private void dfs(List<List<Integer>> edge, List<Integer> suspicious, boolean[] visited, int source) {
        visited[source] = true;
        suspicious.add(source);
        for (int e : edge.get(source)) {
            if (!visited[e]) {
                dfs(edge, suspicious, visited, e);
            }
        }
    }
}
