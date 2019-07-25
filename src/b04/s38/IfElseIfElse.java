package b04.s38;

public class IfElseIfElse {
	public static void main(String[] args) {
		int value = 0;

		if (value < 0) {
			System.out.println("negativo");
		} else if (value >= 0 && value < 100) {
			System.out.println("piccolo");

			if (value >= 0 && value < 100 && value % 2 == 0) {
				System.out.println("pari");

			} else {

				System.out.println("dispari");
			}
		} else {
			System.out.println("grande");
		}

	}
}
