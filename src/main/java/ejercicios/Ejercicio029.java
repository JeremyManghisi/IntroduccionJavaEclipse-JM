package ejercicios;

import java.util.Scanner;

public class Ejercicio029 {

	// COMPLETAR METODO
	public void secuenciaFibonacci() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce el número de términos:");
		int n = scanner.nextInt();

		System.out.print("Secuencia Fibonacci (" + n + " términos): ");

		int a = 0, b = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");

			int siguiente = a + b;
			a = b;
			b = siguiente;
		}
	}

	public static void main(String[] args) {
		Ejercicio029 ejercicio = new Ejercicio029();
		ejercicio.secuenciaFibonacci();
	}
}