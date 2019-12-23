/**
 * 
 */
package heritage;

/**
 * @author florent
 *
 */
public class Calculatrice {

	private double valeurCourante;
	private double memoire;
	
	public Calculatrice(double valeurCourante) {
		super();
		this.valeurCourante = valeurCourante;
	}

	
	public double getValeurCourante() {
		return valeurCourante;
	}

	public void setValeurCourante(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}
	
	public double carre(){
		return Math.pow(this.valeurCourante, 2);
	}
	
	@Override
	public String toString(){
		return("Calculatrice valeurCourante = "+this.valeurCourante);
	}
	
	public void save() {
		this.memoire = getValeurCourante();
	}
	
	public void chargerMemoire() {
		setValeurCourante(this.memoire);
	}
		
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculatrice c = new Calculatrice(55);
		System.out.println(c);
		c.save();
		c.setValeurCourante(20);
		System.out.println(c);
		c.chargerMemoire();
		System.out.println(c);

		

	}

}
