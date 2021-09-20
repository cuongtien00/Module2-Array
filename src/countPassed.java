import java.util.Scanner;

public class countPassed {
    public static void main(String[] args) {
        int[] students = new int[30];
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            System.out.println("Nhap diem thi sinh thu " + (i+1) + ": ");
            students[i] = scanner.nextInt();
        }
        for (int i = 0; i < students.length; i++) {
            if(students[i]>=5){
                count++;
            }
        }
        System.out.println("So thi sinh co diem thi dat la " + count);
    }

}
