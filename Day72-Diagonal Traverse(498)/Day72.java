class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        if(mat.length == 0){
            return new int[0];
        }

        boolean up = true;
        int row = mat.length;
        int col = mat[0].length;
        int r = 0;
        int c = 0;
        int[] result = new int[row * col];

        for (int i = 0; i < row * col; i++) {
            result[i] = mat[r][c];

            if (up) {

                if (c == col - 1) {
                    r++;
                    up = false;
                }

                else if (r == 0) {
                    c++;
                    up = false;
                }

                else {
                    r--;
                    c++;
                }
            } 
            
            else {

                if (r == row - 1) {
                    c++;
                    up = true;
                }

                else if (c==0) {
                    r++;
                    up = true;
                }

                else {
                    r++;
                    c--;
                }
            }
        }

        return result;
    }
}
