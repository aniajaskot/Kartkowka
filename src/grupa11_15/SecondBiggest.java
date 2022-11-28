package grupa11_15;

import java.util.Arrays;
import java.util.Scanner;

public class SecondBiggest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] userNumbers = new int[10];
        boolean same;

        for (int i = 0; i < userNumbers.length; ) {
            System.out.println("Wprowadź " + (i + 1) + " liczbę");
            int next = input.nextInt();
            input.nextLine();
            same = false;
            for (int j = 0; j < userNumbers.length; j++) {
                if (userNumbers[j] == next) {
                    same = true;
                    break;
                }
            }
            if (!same) {
                userNumbers[i] = next;
                i++;
            }
        }
        System.out.println(Arrays.toString(userNumbers));

        int biggest = Integer.MIN_VALUE;

        for (int number : userNumbers) {
            biggest = number > biggest ? number : biggest;
        }

        System.out.println("Największa liczba to " + biggest);

        int secondBiggest = Integer.MIN_VALUE;
        for (int number : userNumbers){
            if (number > secondBiggest && number < biggest) {
                secondBiggest = number;
            }

        }
        System.out.println("Druga największa liczba to " + secondBiggest);
    }
}
