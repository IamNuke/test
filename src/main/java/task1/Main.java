package task1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] numArr = inputArray();
        findMaxMin(numArr);
    }

    private static void findMaxMin(int[] numArr) {

        int max = numArr[0];
        int min = numArr[0];
        for (int j : numArr) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        System.out.printf("Maximum : %d.", max );
        System.out.println();
        System.out.printf("Minimum: %d.", min );
    }

    private static int[] inputArray() {

        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array elements:");
        String str = input.nextLine();
        String[] strArr = str.split(" ");
        int[] numArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        return  numArr;
    }

}