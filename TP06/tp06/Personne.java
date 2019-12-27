package tp06;

import java.time.LocalDate;

public abstract class Personne {
	
	
	private String nom;
	private String prenom;
	private LocalDate naissance;
	private LocalDate arrive;
	
	
	public Personne(String nom, String prenom,  LocalDate naissance, LocalDate arrive) throws DateArriveeInvalideException {
		
		if (arrive.getYear() < 2000 || arrive.getYear() > LocalDate.now().getYear()) {
			throw new DateArriveeInvalideException("Année arrivée dans l'etablissement invalide : " +
					arrive.getYear());
		}
		else {
		this.nom = nom;
		this.prenom = prenom;
		this.naissance = naissance;
		this.arrive = arrive;
	
		}
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


	public LocalDate getNaissance() {
		return naissance;
	}


	public void setNaissance(LocalDate naissance) {
		this.naissance = naissance;
	}


	public LocalDate getArrive() {
		return arrive;
	}


	public void setArrive(LocalDate arrive) {
		this.arrive = arrive;
	}
	
	
	
	public int getAge() {
		return this.getNaissance().until(LocalDate.now()).getYears();
	}
	
	public abstract int getAnciennete();
	
	public String toString() {
		return ("\nNom: " +this.getNom() + "\nPrenom: " + this.getPrenom() + "\nAge: " + this.getAge() + "\nAncienneté: " + this.getAnciennete());
	}
	
	
	public void affiche() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	
	public static void main(String[] args) throws DateArriveeInvalideException {

		Etu e = new Etu("Janssens" , "Florent", LocalDate.of(1970,11,20),LocalDate.of(2000,10,25));
		System.out.println(e);
		Prof p = new Prof("Janssens" , "Florent", LocalDate.of(1980,11,20),LocalDate.of(2000,10,25));
		p.affiche();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 
	private String prenom;
	private LocalDate dateNaissance;
	private LocalDate dateArrivee;

	public Personne() {

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

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public LocalDate getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(LocalDate dateArrivee) throws DateArriveeInvalideException {
		this.dateArrivee = dateArrivee;
	}

	@Override
	public String toString() {
		return ("Nom: " + this.nom + "Prénom: " + this.prenom + "\nAge: " + this.age());
	}

	public int age() {
		return this.dateNaissance.until(LocalDate.now()).getYears();
	}

	public abstract int anciennete();
	
	**/
}