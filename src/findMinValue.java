public class findMinValue {
    public static void main(String[] args) {
        int arr[] = {0, 1, 6, 7, 9, 13};
        System.out.println("Gia tri nho nhat trong mang la " + findMin(arr));
    }
    public static int findMin(int[] a){
        int min = a[0];
        for (int i = 1; i <a.length ; i++) {
            if(min>a[i]){
                min = a[i];
            }
        }
        return min;
    }
}
