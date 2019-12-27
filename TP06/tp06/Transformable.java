/**
 * 
 */
package tp06;

/**
 * @author flore
 *
 */
public interface Transformable extends Affichage {

	public void deplace(int deltaX, int deltaY);
	public void agrandit(int facteur);
	public void affiche();
	
}
