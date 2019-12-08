/**
 * 
 */
package tp03;

import javax.swing.JOptionPane;

/**
 * @author flore
 *
 */
public class Date {

	private int jour;
	private int mois;
	private int annee;
	

	public Date(int jour, int mois, int annee) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	
	public Date() {
		this.jour = Integer.parseInt(JOptionPane.showInputDialog("Entrez le jour"));
		this.mois = Integer.parseInt(JOptionPane.showInputDialog("Entrez le mois"));
		this.annee = Integer.parseInt(JOptionPane.showInputDialog("Entrez l'année"));
	}
	
	public String toString() {
		return (jour+"/"+mois+"/"+annee);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date d = new Date(20,3,1999);
		System.out.println(d);

	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

}
