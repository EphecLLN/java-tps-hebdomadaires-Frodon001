package tp1;

import javax.swing.JOptionPane;

/**
 * Classe permettant la représentation d'un étudiant
 * @author florent
 */
public class Etudiant {
	//Variables d'instance
	String nom;
	String prenom;
	int matricule;
	Date dateNaissance;
	
	
	public Etudiant(String nom, String prenom, int matricule) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
	}
	
	
	public Etudiant(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Etudiant() {
		this.nom = JOptionPane.showInputDialog("Entrez le nom de la personne");
		this.prenom = JOptionPane.showInputDialog("Entrez le pr�nom de la personne");
		this.matricule = Integer.parseInt(JOptionPane.showInputDialog("Entre la matricule de la personne"));

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


	public int getMatricule() {
		return matricule;
	}


	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public String toString() {
		return ("Nom: " + this.nom + "\nPrenom: " + this.prenom + "\nMatricule: " + this.matricule);
	}

	/*
	 * Méthode main qui crée un étudiant et initialise les variables d'instance au départ de la ligne de commande
	 * 
	 */
	public static void main(String[] args) {
		Etudiant etu1 = new Etudiant("janssens", "Florent", 201683);
		Etudiant etu2 = new Etudiant("Vandermael", "GG", 201693);
		Etudiant etu3 = new Etudiant();
		

		System.out.println(etu1);
		System.out.println(etu2);
		System.out.println(etu3);
		
	}

}
