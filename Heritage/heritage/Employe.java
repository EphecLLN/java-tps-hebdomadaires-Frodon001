/**
 * 
 */
package heritage;

/**
 * @author florent
 *
 */
public class Employe extends Personne {

	private int salaire;
	private String employeur;
	
	
	public Employe(String nom, String prenom, int registreN, int salaire, String employeur) {
		super(nom, prenom, registreN);
		this.salaire = salaire;
		this.employeur = employeur;
	}
	
	
	@Override
	public String toString() {
		return (super.toString() + "\nSalaire: " + this.salaire + "\nEmployeur: " + this.employeur);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		if (employeur == null) {
			if (other.employeur != null)
				return false;
		} else if (!employeur.equals(other.employeur))
			return false;
		if (salaire != other.salaire)
			return false;
		return true;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employe e = new Employe("Florent", "Janssens", 1234, 2100, "Ephec");
		Employe e2 = new Employe("Florent", "Janssens", 1234, 2100, "Ephec");
		System.out.println(e.equals(e2));
	}

}
