public class findMaxValue {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 87, 90, 111};
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if(max<data[i]) {
                max = data[i];
            }
        }
        System.out.println("Max in Array is " + max);
    }
}
