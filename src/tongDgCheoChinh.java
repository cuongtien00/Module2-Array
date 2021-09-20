import java.util.Scanner;

public class tongDgCheoChinh {
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
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Tong duong cheo chinh la " + sum);
    }
}

