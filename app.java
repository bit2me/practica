import java.util.Scanner;

public class app {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner lector = new Scanner(System.in);
		int[] array = new int[10];
		int i;
		int menor = 999999;

		do {
			System.out
					.println("Entre 10 numero(menor que 999999) y presiones enter: ");
			for (i = 0; i < 10; i++) {
				array[i] = lector.nextInt();
			}
		} while (i < array.length);

		for (int x = 0; x < array.length; x++) {
			if (array[x] < menor) {
				menor = array[x];
			}
		}

		System.out.println(menor);
	}

}
