package grupa9_15;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Totolotek {
    public static void main(String[] args) {
        int size = 6;
        int [] drawnNumbers = createRandomTable(size);
        int[] userNumbers = createUserTable(size);

        System.out.println("Twoje liczby to: " + Arrays.toString(userNumbers));
        System.out.println("Wylosowane liczby to: " + Arrays.toString(drawnNumbers));

        int howMany = 0;
        for(int i = 0; i < drawnNumbers.length;i++){
            for(int j = 0; j < userNumbers.length; j++){
                if(drawnNumbers[i] == userNumbers[j]){
                    howMany++;
                    break;
                }
            }
        }

        System.out.println("Trafiłeś " + howMany + " liczby");
    }

    private static int[] createRandomTable(int size){
        Random random = new Random();
        int [] drawnNumbers = new int[size];
        for(int i = 0; i < drawnNumbers.length;){
            int next = random.nextInt(48) + 1;
            i = insertIfNotExists(drawnNumbers, i, next);
        }
        return drawnNumbers;
    }

    private static int[] createUserTable(int size){
        Scanner input = new Scanner(System.in);
        int[] userNumbers = new int[6];
        for(int i = 0; i < userNumbers.length;){
            System.out.println("Wprowadź " + (i+1) + " liczbę z zakresu [1,49]");
            int next = input.nextInt();
            input.nextLine();
            if(next > 0 && next < 50) {
                i = insertIfNotExists(userNumbers, i, next);
            } else {
                System.out.println("Liczba spoza zakresu");
            }
        }
        input.close();
        return userNumbers;
    }

    private static int insertIfNotExists(int[] table, int i, int next) {
        boolean same;
        same = false;
        for (int j = 0; j < table.length; j++) {
            if (table[j] == next) {
                same = true;
                break;
            }
        }
        if (!same) {
            table[i] = next;
            i++;
        }
        return i;
    }
}
