class Solution {
    public int orangesRotting(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[] { i, j });
                }
                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0)
            return 0;

        int minutes = -1;
        int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        while (!q.isEmpty()) {
            int size = q.size();
            minutes++;
            for (int j = 0; j < size; j++) {
                int[] curr = q.poll();
                int row = curr[0];
                int column = curr[1];

                for (int i = 0; i < directions.length; i++) {
                    int nr = row + directions[i][0];
                    int nc = column + directions[i][1];

                    if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc]==1) {
                        fresh--;
                        grid[nr][nc]=2;
                        q.add(new int[]{nr,nc});
                    }
                }

            }
        }

       return fresh ==0 ? minutes : -1;
    }
}