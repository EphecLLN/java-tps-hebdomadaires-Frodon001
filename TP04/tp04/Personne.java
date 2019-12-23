/**
 * 
 */
package tp04;

/**
 * @author flore
 *
 */
import javax.swing.JOptionPane;

public class Personne {
	
	private String nom; 
	private String prenom;

	
	public Personne(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;

	}
	
	public Personne(){
		this.nom = JOptionPane.showInputDialog("Entrez le nom !");
		this.prenom = JOptionPane.showInputDialog("Entrez le prénom !");
	}
	
	@Override
	public String toString() {
		return ("Nom: "+this.nom+"\nPrénom: "+this.prenom+"\nRN: ");
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
		return true;
	}

	public int compareTo(Personne pers) {
		if(this.equals(pers)) return 0;
		return (this.nom.length() > pers.nom.length() ? 1 : -1);
		
	}
	
	public static void main(String[] args) {
		Personne p = new Personne();
		Personne p2 = new Personne();
		System.out.println(p.equals(p2));
		System.out.println(p.compareTo(p2));
	}
}