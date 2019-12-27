package bibliotheque;

/**
 * @author florent
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LivreTest {

	@Test
	void testConstructeur() {
		Livre livre1 = new Livre("Aladin", "BABA", 2019);
		assertEquals("Aladin", livre1.getTitre());
		assertEquals("BABA", livre1.getNom());
		assertEquals(2019, livre1.getAnne());
		
		
	}

}
