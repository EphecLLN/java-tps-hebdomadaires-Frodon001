/**
 * 
 */
package tp06;
/**
 * @author flore
 *
 */

public abstract class Shape {
	
	private int id;
	private static int cpt = 1;
	private int coordX;
	private int coordY;
	

	public Shape(int coordX, int coordY) {
		super();
		this.id = cpt;
		this.coordX = coordX;
		this.coordY = coordY;
		cpt++;
	}
	
	public abstract  double surface();
	
	public abstract double perimetre();
	
	public String getNom() {
		return (getClass().getSimpleName() + "-" + this.id);
	}
	
	public String toString() {
		String temp = "";
		temp += this.getNom();
		temp += "\nX: " + this.coordX + "\nY: " + this.coordY;
		temp += "\nSurface: " + this.surface();
		temp += "\nPerimettre: " + this.perimetre();
		return temp;
	}
	
	public void affiche() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	public void deplace(int deltaX, int deltaY) {
		this.coordX = deltaX;
		this.coordY = deltaY;
	}
	
	public void agrandit(int facteur) {
		this.coordX *= facteur;
		this.coordY *= facteur;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Carre c = new Carre(2,2,4);
		System.out.println(c);
		c.deplace(6, 6);
		c.agrandit(2);
		System.out.println(c);
		

	}

}
