import java.util.Scanner;

public class deleteIndex {
    public static void main(String[] args) {
        int num;
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("mang cho truoc");
        for (int a: arr) {
            System.out.println(a);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap phan tu can xoa trong mang");
        num = scanner.nextInt();
        int index = findIndex(num,arr);
        for (int i = index; i <arr.length-1 ; i++) {
            arr[i] = arr[i+1];
        }
        System.out.println("mang sau khi xoa ");
        for (int a:arr) {
            System.out.println(a);
        }
    }
    public static int findIndex(int num,int[] a){
        boolean check = false;
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if(num == a[i]){
                index = i;
            }
        }
        return index;
    }

}
