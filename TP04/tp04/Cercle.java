/**
 * 
 */
package tp04;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @author flore
 *
 */
public class Cercle {

	
	private double rayon;

	
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}


	public double getRayon() {
		return rayon;
	}


	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	public double perim() {
		return (2*Math.PI*this.rayon);
	}
	
	public double air() {
		return (Math.PI*(Math.pow(this.rayon, 2)));
	}
	
	public String toString() {
		NumberFormat formatter = new DecimalFormat("#0.00");
		return ("Cercle de rayon: "+this.rayon+"\nPérimètre: "+formatter.format(this.perim())+
				"\nAire: "+formatter.format(this.air()));
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cercle c = new Cercle(4.5);
		System.out.println(c);

		

	}

}
