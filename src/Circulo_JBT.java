
public class Circulo_JBT extends FiguraGeometrica_JBT {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_JBT(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
		if (radio < 0) {
			Math.abs(radio);
		}
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
