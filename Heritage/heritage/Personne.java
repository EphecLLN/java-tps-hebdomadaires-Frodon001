/**
 * 
 */
package heritage;

/**
 * @author florent
 *
 */
public class Personne {

	
	private String nom;
	private String prenom;
	private int registreN;
	

	
	public Personne(String nom, String prenom, int registreN) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.registreN = registreN;
	}
	

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the registreN
	 */
	public int getRegistreN() {
		return registreN;
	}
	/**
	 * @param registreN the registreN to set
	 */
	public void setRegistreN(int registreN) {
		this.registreN = registreN;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (registreN != other.registreN)
			return false;
		return true;
	}
	
	


	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", registreN=" + registreN + "]";
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
