package ejercicio01;

public class Operaciones {
	double num1, num2;

	public Operaciones() {
		super();
	}

	public Operaciones(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public double suma() {
		return num1 + num2;
	}

	public double resta() {
		return num1 - num2;
	}

	public double multiplicacion() {
		return num1 * num2;
	}

	public double division() {
		return num1 / num2;
	}

	public double maximo() {
		double maximo;
		maximo = num1 > num2 ? num1 : num2;
		return maximo;
	}

	public double minimo() {
		double minimo;
		minimo = num1 < num2 ? num1 : num2;
		return minimo;
	}
}
