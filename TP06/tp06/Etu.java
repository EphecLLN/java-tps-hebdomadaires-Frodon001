package tp06;

import java.time.LocalDate;

public class Etu extends Personne {

	private String matricule;
	
	public Etu(String nom, String prenom, LocalDate naissance, LocalDate arrive) throws DateArriveeInvalideException{
		super(nom, prenom, naissance, arrive) ;
		
		this.matricule = getMatricule();
	}
	
	public int getAnciennete() {
		return super.getArrive().until(LocalDate.now()).getYears();
	}
	
	public String getMatricule() {
		return (this.getArrive().getYear() + "" + this.getNom().charAt(0) + this.getPrenom().charAt(0));
	}
	
	public String toString() {
		return ("\nNom: " +this.getNom() + "\nPrenom: " + this.getPrenom() + "\nAge: " + this.getAge() + "\nAncienneté: " + this.getAnciennete() + "\nMatricule: " + this.getMatricule());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	private String matricule;

	public Etu() {

	}

	public String matricule() {
		return (getNom().charAt(0) + "" + getPrenom().charAt(0) + getDateArrivee().getYear());
	}

	public String toString() {
		return super.toString() + "\nMatricule: " + this.matricule();
	}

	public void setDateArrivee(LocalDate dateArrivee) throws DateArriveeInvalideException {
		if (dateArrivee.getYear() < 2000 || dateArrivee.getYear() > LocalDate.now().getYear()) {
			throw new DateArriveeInvalideException("La date date doit être > 1/1/2000 et < maintenant");
		}
		super.setDateArrivee(dateArrivee);
	}

	@Override
	public int anciennete() {
		return (super.getDateArrivee().until(LocalDate.now()).getYears());
	}
	
	**/
}