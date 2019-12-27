/**
 * 
 */
package tp06;

/**
 * @author flore
 *
 */
public class Cercle extends Shape {

	private double rayon;
	private String centre;
	
	
	public Cercle(int coordX,int coordY, double rayon) {
		super(coordX,coordY);
		this.rayon = rayon;		
		this.centre = coordX + ";" + coordY;
	}

	/**
	 * @return les coordonn�es du centre du cercle
	 */
	public String getCentre() {
		return this.centre;
	}
	/**
	 * @param absisse du centre du cercle
	 * @param ordonne du centre du cercle
	 */
	public void setCentre(int coordX, int coordY) {
		this.centre = coordX + ";" + coordY;
	}
	
	/**
	 *@return la surface du Cercle arrondi 2 chiffre apr�s la virgule
	 */
	public double surface() {
		double surface = (Math.pow(this.rayon, 2.0) * Math.PI);
		double surfaceArrondi = arrondiNDecimales(surface, 2);
		
		return surfaceArrondi;
	}
	/**
	 *@return le perimetre du Cercle arrondi 2 chiffre apr�s la virgule
	 */
	public double perimetre() {
		double perimetre = 2 * Math.PI * this.rayon;
		double perimetreArrondi = arrondiNDecimales(perimetre, 2);
		
		return perimetreArrondi;
	}
	
	/**
	 * @param x : double, nombre � arrondir
	 * @param n : int, nombre de chiffre apr�s la virgule
	 * @return le nombre avec le nombre (n) de chiffre apr�s la virgule
	 */
	private static double arrondiNDecimales(double x, int n) { 
		double pow = Math.pow(10, n); return (Math.floor(x * pow)) / pow; 
	}
	


}
