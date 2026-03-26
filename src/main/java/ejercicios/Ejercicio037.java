package ejercicios;

public class Ejercicio037 {

	// COMPLETAR METODO
	public void contarRepeticiones() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		int[] numeros = new int[5];

		for (int i = 0; i < 5; i++) {
			numeros[i] = scanner.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			int contador = 0;
			boolean yaContado = false;

			for (int j = 0; j < i; j++) {
				if (numeros[i] == numeros[j]) {
					yaContado = true;
					break;
				}
			}

			if (!yaContado) {
				for (int j = 0; j < numeros.length; j++) {
					if (numeros[i] == numeros[j]) {
						contador++;
					}
				}

				System.out.println(numeros[i] + " se repite " + contador + " vez/veces");
			}
		}
	}

	public static void main(String[] args) {
		Ejercicio037 ejercicio = new Ejercicio037();
		ejercicio.contarRepeticiones();
	}
}