package javaConcepts;

import java.util.Scanner;
public class Identity_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter the elementns of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        boolean isIdentityMatrix = isIdentity(matrix);

        if (isIdentityMatrix) {
            System.out.println("The given matrix is an identity matrix.");
        } else {
            System.out.println("The given matrix is not an identity matrix.");
        }
        scanner.close();
    }
    private static boolean isIdentity(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Check if the matrix is square
        if (rows != cols) {
            return false;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) {
                    return false;
                }
            }
        }
        return true;
    }
}

