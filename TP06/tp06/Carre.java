/**
 * 
 */
package tp06;

/**
 * @author flore
 *
 */
public class Carre extends Shape {
 
	private int cote;
	private String pointGauche;
	
	public Carre(int coordX, int coordY, int cote) {
		super(coordX,coordY);
		this.pointGauche = coordX + ";" + coordY;
		this.cote = cote;
	}
	
	public String getPointGauche() {
		return pointGauche;
	}

	public void setPointGauche(int coordX, int coordY) {
		this.pointGauche = coordX + ";" + coordY;
	}

	@Override
	public double surface() {
		return this.cote * this.cote;
	}

	@Override
	public double perimetre() {
		return 4 * this.cote;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Carre c = new Carre(2,2,4);
		System.out.println(c);

	}

}
