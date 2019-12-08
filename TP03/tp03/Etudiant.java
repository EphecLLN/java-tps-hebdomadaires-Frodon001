/**
 * 
 */
package tp03;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * @author flore
 *
 */
public class Etudiant {

	
	private String nom;
	private String prenom;
	private String numMatricule;
	private Date ddn;
	private int [] resultats;
	
	
	public Etudiant(String nom, String prenom, String numMatricule, Date ddn, int[] resultats) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numMatricule = numMatricule;
		this.ddn = ddn;
		this.resultats = resultats;
	}

	
	public Etudiant() {
		this.nom = JOptionPane.showInputDialog("Entrez le nom");
		this.prenom = JOptionPane.showInputDialog("Entrez le prenom");
		this.numMatricule = JOptionPane.showInputDialog("Entrez le matricule");
		this.ddn = new Date(1,1,2000);
		this.resultats = new int [5]; //new int [Integer.parseInt(JOptionPane.showInputDialog("Entrez le nbre de cotes"))];
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNumMatricule() {
		return numMatricule;
	}


	public void setNumMatricule(String numMatricule) {
		this.numMatricule = numMatricule;
	}


	public Date getDdn() {
		return ddn;
	}


	public void setDdn(Date ddn) {
		this.ddn = ddn;
	}


	public int[] getResultats() {
		return resultats;
	}


	public void setResultats(int[] resultats) {
		this.resultats = resultats;
	}

	public String toString() {
		return("nom ="+this.nom+", prenom="+this.prenom+", matricule="+this.numMatricule+
				", dateNaissance="+this.ddn+", resultats="+Arrays.toString(resultats));
	}
	
	
	public double moyenne() {
		double somme = 0.0;
		
		for(int r : resultats) {
			somme += r;
		}
		return (somme/(double) resultats.length);
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Etudiant e = new Etudiant("janssens", "florent", "HE201683", new Date(1,1,2000), new int [] {1,2,3,4,5});
		System.out.println(e);
		System.out.println(e.moyenne());

	}

}
