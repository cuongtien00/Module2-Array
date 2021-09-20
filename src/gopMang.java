public class gopMang {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {7, 8, 9, 10, 11};
        int[] arr3 = new int[arr1.length+ arr2.length];
        int[] newArr = gopArr(arr1, arr2, arr3);
        System.out.println("Mang sau khi gop");
        for (int x:newArr) {
            System.out.println(x);
        }
    }
    public static int[] gopArr(int[] arr1, int[] arr2, int[] arr3){
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr3.length-1; i >= arr1.length ; i--) {
            arr3[i] = arr2[i- arr1.length];
        }
        return arr3;
    }
}
