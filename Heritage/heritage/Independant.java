/**
 * 
 */
package heritage;

/**
 * @author florent
 *
 */
public class Independant extends Personne {


	private String TVA;
	
	
	public Independant(String nom, String prenom, int registreN, String TVA) {
		super(nom, prenom, registreN);
		this.TVA = TVA;
	}
	
	
	
	@Override
	public String toString() {
		return (super.toString() + "\nTVA: " + this.TVA);
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
