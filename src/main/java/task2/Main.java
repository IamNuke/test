package task2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter year:");
        int year = input.nextInt();
        if (isLeapYear(year)) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    private static boolean isLeapYear(int year) {

        return  ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

    }
}
