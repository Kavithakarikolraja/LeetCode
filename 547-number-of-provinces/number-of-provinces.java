class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                while (!queue.isEmpty()) {
                    int city = queue.poll();
                    visited[city] = true;
                    for (int next = 0; next < n; next++) {
                        if (isConnected[city][next] == 1 && !visited[next]) {
                            queue.add(next);
                        }
                    }
                }
            }
        }
        return count;
    }
}
