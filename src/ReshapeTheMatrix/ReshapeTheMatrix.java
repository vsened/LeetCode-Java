package ReshapeTheMatrix;

public class ReshapeTheMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat.length * mat[0].length)
            return mat;
        int[][] result = new int[r][];
        int row = 0;
        int column = 0;
        result[row] = new int[c];
        for(int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (column == c){
                    row++;
                    result[row] = new int[c];
                    column = 0;
                }
                result[row][column++] = mat[i][j];
            }
        }
        return result;
    }
}
