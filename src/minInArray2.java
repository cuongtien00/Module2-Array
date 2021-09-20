import java.util.Scanner;

public class minInArray2 {
        public static void main(String[] args) {
            int[][] matrix = new int[3][3];
            Scanner input = new Scanner(System.in);
            System.out.println("Enter " + matrix.length + " rows and " +
                    matrix[0].length + " columns: ");
            for (int row = 0; row < matrix.length; row++) {
                for (int column = 0; column < matrix[row].length; column++) {
                    matrix[row][column] = input.nextInt();
                }
            }
            int min = matrix[0][0];
            for (int row = 0; row < matrix.length; row++) {
                for (int column = 0; column < matrix[row].length; column++) {
                    if(min>matrix[row][column]){
                        min = matrix[row][column];
                    }
                }
            }
            System.out.println("Gia tri nho nhat trong mang la " + min);
        }
}
