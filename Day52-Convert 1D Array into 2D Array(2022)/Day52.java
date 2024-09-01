class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {

        int len = original.length;

        if (len != m * n || len == 0) {
            return new int[0][0];
        }

        if (m * n == 0) {
            return new int[0][0];
        }

        int[][] arr = new int[m][n];
        int index = 0;

        while (index <= len - 1) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = original[index];
                    index++;
                }
            }
        }

        return arr;
    }
}
