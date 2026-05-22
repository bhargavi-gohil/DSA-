package SwitchCase;

import java.util.Scanner;
public class role {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String role = sc.nextLine();
  // admin , student, teacher, guest,
        switch (role) {
            case "admin":
                System.out.println("Can access anything");
                break;
            case "Teacher":
                System.out.println("Can access all student details");
                break;
            case "Student":
                System.out.println("Can access Syllabus details");
                break;
            case "guest":
                System.out.println("Cannot access details");
                break;
            default:
                System.out.println("Invalid Role!!");
                
        }
        sc.close();
    }
}
