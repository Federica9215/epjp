package b08;

import java.util.Scanner;

public class S87 {
    public static void main(String[] args) {
        System.out.println("Please, enter a few numbers");
        double result = 0;

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) { //finchè nello scanner c'è qlks da leggere
            if (scanner.hasNextDouble()) { // se nelLo scanner c e qlks da leggere 
                result += scanner.nextDouble(); //allora dammi il risultato
            } else {
                System.out.println("Bad input, discarded: " + scanner.next());
            }
        }
        scanner.close(); // see try-with-resources
        System.out.println("Total is " + result);
    }
}
