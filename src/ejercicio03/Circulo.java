package ejercicio03;

public class Circulo {
	double radio;

	public Circulo() {
		super();
	}

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	double circunferencia() {
		return Math.PI * radio * 2;
	}

	double area() {
		return Math.PI * Math.pow(radio, 2);
	}
}
