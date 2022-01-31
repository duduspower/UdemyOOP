package RotateMatrix;

public class Matrix {

    public void printOrginalArray(int [][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public void rotate90(int matrix[][]){
        int [][] tempMatrix = new int[matrix[0].length][matrix.length];

        for(int i = 0; i < tempMatrix.length; i++){
            for(int j = 0; j < tempMatrix[i].length; j++){
                tempMatrix[i][j] = matrix[j][i];
                System.out.print(tempMatrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public void rotate180(int matrix[][]){
        int [][] tempMatrix = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < tempMatrix.length; i++){
            for(int j = 0; j < tempMatrix[i].length; j++){
                tempMatrix[i][j] = matrix[i][tempMatrix[i].length - j - 1];
                System.out.print(tempMatrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public void rotate270(int matrix[][]){
        int [][] tempMatrix1 = new int[matrix.length][matrix[0].length];
        int [][] tempMatrix2 = new int[matrix[0].length][matrix.length];

        for(int i = 0; i < tempMatrix1.length; i++){
            for(int j = 0; j < tempMatrix1[i].length; j++){
                tempMatrix1[i][j] = matrix[i][tempMatrix1[i].length - j - 1];
               // System.out.println(tempMatrix1[i][tempMatrix1[i].length - j]);
            }
        }

        for(int i = 0; i < tempMatrix2.length; i++){
            for(int j = 0; j < tempMatrix2[i].length; j++){
                tempMatrix2[i][j] = tempMatrix1[j][i];
                System.out.print(tempMatrix2[i][j] + "  ");
            }
            System.out.println("");
        }


    }

}
