import java.util.Scanner;

public class addIndex {
    public static void main(String[] args) {
        int index;
        int newValue;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] newArr = new int[arr.length+1];
        System.out.println("mang truoc khi them");
        showArr(arr);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chi so cua phan tu muon them");
        index = scanner.nextInt();
        System.out.println("Nhap phan tu muon them");
        newValue = scanner.nextInt();
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = arr.length; i > index ; i--) {
            newArr[i] = arr[i-1];
        }
        newArr[index] = newValue;
        System.out.println("mang sau khi them");
        showArr(newArr);
    }
    public static void showArr(int []arr){
        for (int a: arr) {
            System.out.println(a);
        }
    }
}
