/**
 * 
 */
package bibliotheque;

import java.util.Arrays;

/**
 * @author flore
 *
 */
public class Dictionnaire extends Livre {

	private String [][] dictPages;
	
	
	/**
	 * 
	 * @param titre
	 * @param nom
	 * @param anne
	 */
	public Dictionnaire(String titre, String nom, int anne) {
		super(titre, nom, anne);
		this.dictPages = new String [100][10];
		// TODO Auto-generated constructor stub
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dictionnaire other = (Dictionnaire) obj;
		if (!Arrays.deepEquals(dictPages, other.dictPages))
			return false;
		return true;
	}
	
	


	@Override
	public String toString() {
		return "Dictionnaire [nomAuteur=" + nom + ", titre=" + titre
				+ ", anneeEdition=" + anne + "]";
	}
	
	public String getPage(int i) {
		if(i >= 0 && i < this.dictPages[i].length) {
			String chaineFinal = "";
			for(int k = 0; k < dictPages[i].length; k++) {
				chaineFinal += dictPages[i][k] + "\n";
			}
			return chaineFinal;
		}else {
			return null;
		}
	}
	
	public String setPage(int i, String [] p) {
		if(i >= 0 && i < this.dictPages[i].length) {
			String valeur = "";
			for(int j = 0; j < this.dictPages[i].length; j ++) {
				valeur += p[j];
				this.dictPages[i][j] = p[j];
			}
			return valeur;
		}
		return null;
	}
	
	public String getFirstDefinition() {
		return this.dictPages[0][0];
	}
	
	public String extrait() {
		return this.dictPages[0][0];
	}
	
	public String getDefinition(int i, int j) {
		return this.dictPages[i][j];
	}
	public String setDefinition(int i, int j, String p) {
		String valeurAvant = this.dictPages[i][j];
		this.dictPages[i][j] = p;
		return valeurAvant;
	}





	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
