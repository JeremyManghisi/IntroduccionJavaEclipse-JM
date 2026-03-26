package ejercicios;

import java.util.Scanner;

public class Ejercicio027 {

	// COMPLETAR METODO
	public void decimalABinario() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce un número:");
		int n = scanner.nextInt();

		if (n == 0) {
			System.out.println("Binario: 0");
			return;
		}

		String binario = "";

		while (n > 0) {
			int resto = n % 2;
			binario = resto + binario;
			n = n / 2;
		}

		System.out.println("Binario: " + binario);
	}

	public static void main(String[] args) {
		Ejercicio027 ejercicio = new Ejercicio027();
		ejercicio.decimalABinario();
	}
}