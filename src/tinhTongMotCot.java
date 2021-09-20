import java.util.Scanner;

public class tinhTongMotCot {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner input = new Scanner(System.in);
        int cols;
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        System.out.println("Nhap chi so cot can tinh tong");
        cols = input.nextInt();
        int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][cols];
            }
            System.out.println("tong cac so o cot " + cols + " la " + sum);
    }
}
