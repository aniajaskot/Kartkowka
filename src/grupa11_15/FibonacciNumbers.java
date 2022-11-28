package grupa11_15;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;
        int howMany = 0;
        do {
            System.out.println("Wprowadź liczbę");
            number = input.nextInt();
            input.nextLine();
            if (number > 0) {
                System.out.println(fibonacci(number));
                if(number % 3 == 0){
                    sum += number;
                    howMany++;
                }
            }

        } while (number > 0);

        if(howMany > 0) {
            double average = (1.0 * sum) / howMany;
            System.out.println("średnia " + ((1.0 * sum) / howMany));
        }
    }

    private static int fibonacci(int number) {
        int first = 0;
        int second = 1;
        int third = 1;
        while (third <= number || third % 2 != 0) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }
}
