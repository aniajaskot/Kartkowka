package grupa9_15;

import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;

        number = 1;
        while (number > 0) {
            System.out.println("Wprowadź liczbę");
            number = input.nextInt();
            input.nextLine();
            if (number > 0) {
                findDividers(number);
                powers(number);
                sum += number;
            }
        }


        System.out.println("Suma liczb wynosi " + sum);
    }


    private static void findDividers(int number) {
        System.out.print("Dzielniki to: ");
        int howMany = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                howMany++;
            }
        }
        if (howMany <= 2) {
            System.out.print(" - Liczba pierwsza");
        }
        System.out.println();
    }

    private static void powers(int number) {
        System.out.print("Potęgi 2 to: ");
        for (int i = 0; Math.pow(2, i) <= number; i++) {
            System.out.print(Math.pow(2, i) + " ");
        }
        System.out.println();
    }
}
