package task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numArr = inputArray();
        System.out.println("Enter number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] newArr = processArray(numArr, number);
        for (int j : newArr) {
            System.out.printf("%3d", j);
        }
    }

    private static int[] processArray(int[] numArr, int number) {
        int tmp;
        for (int i = 0; i < numArr.length; i++){
           if (number == numArr[i]){
               for (int j = i; j < numArr.length-1; j++){
                   tmp = numArr[j];
                   numArr[j] = numArr[j+1];
                   numArr[j+1] = tmp;
               }
           }
        }
        return numArr;
    }

    private static int[] inputArray() {

        Scanner input = new Scanner(System.in);
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
