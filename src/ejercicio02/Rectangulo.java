package ejercicio02;

public class Rectangulo {
	double alto, ancho;
	
	public Rectangulo() {
		super();
	}

	public Rectangulo(double alto, double ancho) {
		super();
		this.alto = alto;
		this.ancho = ancho;
	}
	
	public double perimetro() {
		return ancho * 2 + alto * 2;
	}

	public double area() {
		return ancho * alto;
	}
}
