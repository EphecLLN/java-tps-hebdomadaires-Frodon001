/**
 * 
 */
package tp03;

/**
 * @author florent
 *
 */
public class ExerciceTDD {

	/**
	 * la methode v�rifie que le nombre est pair
	 * @param n
	 * @return true si n est pair et false si n est impair
	 */
	public boolean estPair(int n) {
		return(n%2 == 0);
	}
	
	/**
	 * la methode calcule le perimettre d'un carre
	 * @param n
	 * @return le produit de ce nombre par 4
	 */
	public double perimetreCarre(double n) {
		return(n*4);
	}
	/**
	 * la methode v�rifie si le charatere est pr�sent ou non dans la string
	 * @param a le charat�re a rechercher
	 * @param s la string
	 * @return true si le charact est pr�sentt et false si non
	 */
	public boolean contientChar(char a, String s) {
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == a) return true;
		}
		return false;
	}
	
public static void main(String[] args) {
		
		ExerciceTDD exe = new ExerciceTDD();
		exe.estPair(2);
	}
	
}
