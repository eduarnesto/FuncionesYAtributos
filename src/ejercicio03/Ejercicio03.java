package ejercicio03;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Ejercicio03 {
	// Scanner para leer del teclado
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Variable para saber la opcion
		int opc;

		// Variable para el ancho, el alto y el resultado
		double radio = 0, res = 0;

		Circulo operacion;

		// Llamo a la función del menú
		opc = menu();

		while (opc != 0)

			// Llamo a la función del menú
			opc = menu();

		radio = pideRadio();

		operacion = new Circulo(radio);

		switch (opc) {
		case 1 -> {
			res = operacion.circunferencia();
		}
		case 2 -> {
			res = operacion.area();
		}
		}

		// Muestro el resultado de la operación
		System.out.println("El resultado de la operación es: " + res);

		sc.close();
	}

	public static int menu() {
		int opc = -1;
		System.out.println("1.Circunferencia");
		System.out.println("2.Area");
		System.out.println("0.Salir");
		do {
			try {
				System.out.println("Elige una opción");
				opc = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Valor introducido no válido");
			} finally {
				sc.nextLine();
			}
		} while (opc < 0 || opc > 2);
		return opc;
	}

	public static double pideRadio() {
		double radio = 0;
		boolean seguir = true;
		do {
			try {
				System.out.println("Introduzca el radio");
				radio = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Valor introducido no válido");
			} finally {
				sc.nextLine();
			}
		} while (seguir);
		return radio;
	}
}