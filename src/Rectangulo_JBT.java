/**
 * @author jesusbinadetrives
 * @version 1.2
 */
public class Rectangulo_JBT extends FiguraGeometrica_JBT {
	private double l1;
	private double l2;

	/**
	 * Constructor
	 * @param tipoFigura: hereda atributo clase abstracta.
	 * @param lG: l1
	 * @param lP: l2
	 */
	public Rectangulo_JBT(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Método que obtiene el área.
	 * @return área.
	 */
	@Override
	public double area() {
		return l1 * l2;
	}

	/**
	 * Método que obtiene el perímetro.
	 * @return perímetro.
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
