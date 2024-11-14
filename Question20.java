import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        int[][] matrix = {
            {  1,  2,  3,  4 },
            {  5,  6,  7,  8 },
            {  9, 10, 11, 12 },
            { 13, 14, 15, 16 }
        };

        System.out.println("What do you want to display?");
        System.out.println("1. The matrix");
        System.out.println("2. Left diagonal in matrix format");
        System.out.println("3. Right diagonal elements in matrix format");
        System.out.println("4. The sum of all elements in the matrix");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                displayMatrix(matrix);
                break;
            case 2:
                displayLeftDiagonal(matrix);
                break;
            case 3:
                displayRightDiagonal(matrix);
                break;
            case 4:
                displaySumOfAllElements(matrix);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void displayLeftDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    static void displayRightDiagonal(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j == cols - 1 - i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    static void displaySumOfAllElements(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of elements in the matrix = " + sum);
    }
}
