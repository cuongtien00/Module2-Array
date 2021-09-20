import java.util.Scanner;

public class Chuyennhietdo {
    public static void main(String[] args) {
        int choice;
        double c;
        double f;
        System.out.println("Menu");
        System.out.println("1. từ độ C sang độ F");
        System.out.println("2. từ độ F sang độ C");
        System.out.println("0. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban chon");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("moi ban nhap do C");
                c = scanner.nextDouble();
                System.out.println("Do F tuong ung la " + cToF(c));
                break;

            case 2:
                System.out.println("moi ban nhap do F");
                f = scanner.nextDouble();
                System.out.println("Do C tuong ung la " + fToC(f));
                break;
            case 0:
                System.exit(0);
        }

    }
    public static double cToF(double c){
        double f = (c+32)*9/5;
        return f;

    }
    public static double fToC(double f){
        double c = (f-32)*5/9;
        return c;
    }
}
