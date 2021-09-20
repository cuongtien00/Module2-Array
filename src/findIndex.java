import java.util.Scanner;

public class findIndex {
    public static void main(String[] args) {
        String name;
        String[] students = {"Cuong", "Hiep", "Thao", "Huyen", "Duong", "Phuong" };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap ten");
        name = scanner.nextLine();
       boolean check = false;
        for (int i = 0; i <students.length ; i++) {
            if(students[i].equals(name)) {
                check = true;
            }
        }

       if(check) {
           System.out.println("Ten ban co trong danh sach");
       }
       else{
           System.out.println("Ten ban khong co trong danh sach");
       }

       }
    }

