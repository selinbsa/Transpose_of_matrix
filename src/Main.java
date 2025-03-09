import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking rows
        System.out.println("Enter the number of rows of the matrix: ");
        int rows = scanner.nextInt();

        //Taking columns
        System.out.println("Enter the number of columns of the matrix: ");
        int columns = scanner.nextInt();

        //Create a matrix
        int[][] original_matrix = new int [rows][columns];

        //Taking values for matrix and put into matrix
        System.out.println("Please enter " + (rows * columns) + " numbers: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Matris[" + i + "][" + j + "]: ");
                original_matrix[i][j] = scanner.nextInt();
            }
        }

        //Showing original matrix
        System.out.println("Orijinal Matris:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%4d", original_matrix[i][j]);
            }
            System.out.println();
        }

        //Creating transpose of original matrix and putting original matrix values to transpose matrix
        int[][] transpose = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = original_matrix[i][j];
            }
        }

        //Showing transpose matrix
        System.out.println("Transpose Matris:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.printf("%4d", transpose[i][j]);
            }
            System.out.println();
        }



    }

}