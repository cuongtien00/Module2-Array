import java.util.Scanner;

public class addIndex {
    public static void main(String[] args) {
        int index;
        int newValue;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("mang truoc khi them");
        showArr(arr);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chi so cua phan tu muon them");
        index = scanner.nextInt();
        System.out.println("Nhap phan tu muon them");
        newValue = scanner.nextInt();
        for (int i = arr.length-1; i > index ; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = newValue;
        System.out.println("mang sau khi them");
        showArr(arr);
    }
    public static void showArr(int []arr){
        for (int a: arr) {
            System.out.println(a);
        }
    }
}
