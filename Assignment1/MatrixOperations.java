import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions for Matrix 1
        System.out.print("Enter rows and columns of Matrix 1: ");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input dimensions for Matrix 2
        System.out.print("Enter rows and columns of Matrix 2: ");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();

        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Addition and Subtraction (only if dimensions match)
        if (rows1 == rows2 && cols1 == cols2) {
            System.out.println("\nAddition:");
            printMatrix(addMatrices(matrix1, matrix2));

            System.out.println("\nSubtraction:");
            printMatrix(subtractMatrices(matrix1, matrix2));
        } else {
            System.out.println("\nAddition and Subtraction cannot be performed (dimension mismatch).");
        }

        // Multiplication (cols1 == rows2)
        if (cols1 == rows2) {
            System.out.println("\nMultiplication:");
            printMatrix(multiplyMatrices(matrix1, matrix2));
        } else {
            System.out.println("\nMultiplication cannot be performed (invalid dimensions).");
        }

        scanner.close();
    }

    // Method for matrix addition
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method for matrix subtraction
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // Method for matrix multiplication
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
