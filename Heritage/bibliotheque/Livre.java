/**
 * 
 */
package bibliotheque;

import java.util.Arrays;

/**
 * @author flore
 *
 */
public class Livre {

	protected String titre;
	protected String nom;
	protected int anne;
	protected String[] pages;
	
	
	
	public Livre(String titre, String nom, int anne, String pages []) {
		super();
		setNom(nom);
		setTitre(titre);
		setAnne(anne);
		setPages(pages);
	}
	
	public Livre(String titre, String nom, int anne) {
		super();
		setNom(nom);
		setTitre(titre);
		setAnne(anne);
		pages = new String[100];
	}




	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}
	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		if(titre == "") {
			this.titre = "Titre inconnu";
		} else {
			
	
		this.titre = titre;
		}
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
		if(nom == "") {
			this.nom = "Nom inconnu";
		} else {
			
	
		this.nom = nom;
		}
	}
	
	/**
	 * @return the anne
	 */
	public int getAnne() {
		return anne;
	}
	/**
	 * @param anne the anne to set
	 */
	public void setAnne(int anne) {
		this.anne = anne;
	}
	/**
	 * @return the pages
	 */
	public String getPages(int i) {
		if(i >= 0 && i < this.pages.length) {
			return this.pages[i];
		}
		else {
			return null;
		}
	}
	
	/**
	 * @param pages the pages to set
	 */
	public void setPages(String[] pages) {
		this.pages = pages;
	}
	
	/**
	 * @param pages the pages to set
	 */
	public String setPages(int i, String p) {
		if(i >= 0 && i < this.pages.length) {
			String valeur = this.pages[i];
			this.pages[i] = p;
			return valeur;	
		}
		else {
			return " error";
		}
	}
	
	public String getFirtsPage() {
		return this.getPages(0);
	}
	
	

	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anne;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + Arrays.hashCode(pages);
		result = prime * result + ((titre == null) ? 0 : titre.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livre other = (Livre) obj;
		if (anne != other.anne)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (!Arrays.equals(pages, other.pages))
			return false;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", nom=" + nom + ", anne=" + anne + ", pages=" + Arrays.toString(pages) + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dictionnaire monLivre = new Dictionnaire("L'amour" , "BABA", 1999);
		String [] pagesDico = {"1","2","3","4","5","6","7","8","9","10"};
		System.out.println(monLivre.getFirtsPage());
		System.out.println(monLivre);
		monLivre.setPage(0, pagesDico);
		System.out.println(monLivre.setDefinition(0,3, "Le game"));
		System.out.println(monLivre.getDefinition(0, 3));

	}

}
