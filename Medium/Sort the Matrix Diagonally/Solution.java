class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        for(int i=1; i<rows-1; i++) {
            sortDiagonal(mat,i,0);
        }
        for(int i=0; i<cols; i++) {
            sortDiagonal(mat,0,i);
        }
        return mat;
    }
    public void sortDiagonal(int[][] mat, int i, int j){
        List<Integer> list = new ArrayList<>();
        int x = i, y = j, index = 0;
        while (i<mat.length && j<mat[0].length){
            list.add(mat[i][j]);
            i++;
            j++;
        }
        Collections.sort(list);
        while (x<mat.length && y<mat[0].length){
            mat[x][y] = list.get(index);
            index++;
            x++;
            y++;
        }
    }
}