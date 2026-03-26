package ejercicios;

import java.util.Scanner;

public class Ejercicio030 {

	// COMPLETAR METODO
	public void procesarNumeros() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce 5 números:");

		int[] numeros = new int[5];

		for (int i = 0; i < 5; i++) {
			numeros[i] = scanner.nextInt();
		}

		int suma = 0;
		int max = numeros[0];
		int min = numeros[0];

		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];

			if (numeros[i] > max) {
				max = numeros[i];
			}

			if (numeros[i] < min) {
				min = numeros[i];
			}
		}

		System.out.println("La suma es: " + suma);
		System.out.println("El mayor número es: " + max);
		System.out.println("El menor número es: " + min);
	}

	public static void main(String[] args) {
		Ejercicio030 ejercicio030 = new Ejercicio030();
		ejercicio030.procesarNumeros();
	}
}