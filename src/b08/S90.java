package b08;

import java.util.Scanner;

public class S90 {
	static int i;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("How much number?");

		int n = 0;
		n = scanner.nextInt();

		// LOOP to get number size

		System.out.println("Your number are: " + n);

		int numbers[] = new int[n];
		double average = 0;
		double sum = 0;

		while (scanner.hasNext()) { // finchè nello scanner c'è qlks da leggere
			if (scanner.hasNextDouble()) { // se nelLo scanner c e qlks da leggere
				for (int i = 0; i < n; i++)
					numbers[i] = scanner.nextInt();

				average = (sum + numbers[i]) / i;
				scanner.nextDouble(); // allora dammi il risultato
			} else {
				System.out.println("The average is; " + scanner.next());
			}
		}
		scanner.close(); // see try-with-resources
		System.out.println("The average is" + average);
	}
}