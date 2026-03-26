package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio026 {

	// COMPLETAR METODO
	public void gestorUsuarios() {
		Scanner scanner = new Scanner(System.in);

		int contador = 0;
		String masLargo = "";
		String masCorto = "";

		while (true) {
			String nombre = scanner.nextLine();

			if (nombre.equals("fin")) {
				break;
			}

			if (contador == 0) {
				masLargo = nombre;
				masCorto = nombre;
			} else {
				if (nombre.length() > masLargo.length()) {
					masLargo = nombre;
				}
				if (nombre.length() < masCorto.length()) {
					masCorto = nombre;
				}
			}

			contador++;
		}

		if (contador == 0) {
			System.out.println("No se introdujeron nombres.");
			return;
		}

		System.out.println("Cantidad de nombres: " + contador);
		System.out.println("Nombre más largo: " + masLargo);
		System.out.println("Nombre más corto: " + masCorto);
	}

	public static void main(String[] args) {
		Ejercicio026 ejercicio = new Ejercicio026();
		ejercicio.gestorUsuarios();
	}
}