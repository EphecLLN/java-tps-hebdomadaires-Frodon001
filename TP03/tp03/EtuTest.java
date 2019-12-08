/**
 * 
 */
package tp03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author flore
 *
 */
class EtuTest {

	@Test
	public void testEtudiant() {
		Etudiant etu = new Etudiant();
		assertNotNull("Les variables d'instance de type de String ne sont pas initialisées", etu.getNom());
		assertNotNull("Les variables d'instance de type de String ne sont pas initialisées", etu.getPrenom());
		assertNotNull("Les variables d'instance de type de String ne sont pas initialisées", etu.getNumMatricule());
	}
	
	@Test
	public void testMoyenne() {
		Etudiant e = new Etudiant("Janssens", "Florent", "HE201683", new Date(1,1,2001), new int [] {1,2,3,4,5});
		assertEquals(3.0, e.moyenne(), 0.0);
		
		e = new Etudiant("Dewulf", "Arnaud", "HE123456", new Date(1,1,2001), new int [] {1,1,1,1,1});
		assertEquals(1.0, e.moyenne(), 0.0);
	}

}
