package ejercicio01;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Ejercicio01 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Variable para saber la opcion
		int opc;

		// Variable para los dos números y el resultado
		double num1, num2, res = 0;
		
		//Variable para llamar al objeto
		Operaciones operacion;

		// Llamo a la función del menú
		opc = menu();

		while (opc != 0) {
			
			// Lamo a la funcion pedir número
			num1 = pideNumero();
			num2 = pideNumero();

			// Hago la operación que me pida el usuario
			operacion = new Operaciones(num1, num2);
			switch (opc) {
			case 1 -> {
				res = operacion.suma();
			}
			case 2 -> {
				res = operacion.resta();
			}
			case 3 -> {
				res = operacion.multiplicacion();
			}
			case 4 -> {
				res = operacion.division();
			}
			case 5 -> {
				res = operacion.maximo();
			}
			case 6 -> {
				res = operacion.minimo();
			}
			}

			// Muestro el resultado de la operación
			System.out.println("El resultado de la operación es: " + res);

			// Llamo a la función del menú
			opc = menu();
			}
			System.out.println("Saliendo...");
			
			sc.close();
	}

	public static int menu() {
		int opc = -1;
		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Multiplicación");
		System.out.println("4.División");
		System.out.println("5.Máximo");
		System.out.println("6.Mínimo");
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
		} while (opc < 0 || opc > 6);
		return opc;
	}

	public static double pideNumero() {
		double num = 0;
		boolean seguir = true;
		do {
			try {
				System.out.println("Introduzca un número");
				num = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Valor introducido no válido");
			} finally {
				sc.nextLine();
			}
		} while (seguir);
		return num;
	}

}