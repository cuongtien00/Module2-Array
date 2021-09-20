public class countTime {
    public static void main(String[] args) {
        String name = "cuongtien";
        char charector = 'n';
        System.out.println("So lan xuan hien cua " + charector + " trong chuoi " + name + " la " +  count("cuongtien",'m'));

    }
    public static int count(String text, char charector){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            if (a==charector) count++;
        }
        return count;
    }
}
