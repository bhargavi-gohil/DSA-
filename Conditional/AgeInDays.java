// package Conditional;
import java.util.Scanner;
public class AgeInDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int years = N / 365;
        int remainingDays = N % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(days + " days");
    }
}
