/**
 * 
 */
package tp04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

/**
 * @author florent
 *
 */
class EtuTest {


	
	@Test
	void testMoyenne() {
		Etu florent = new Etu("Janssens","Florent");
		Etu amaury = new Etu("Crenier", "Amaury");
		Etu ludo = new Etu("Kinnaert", "Ludobic");
		florent.setResultats(new int[] {10,10,10,10,10});
		assertEquals(10.0, florent.moyenne());
		florent.setResultats(new int[] {20,20,20,20,20});
		assertEquals(20.0, florent.moyenne(), 0.0);
		florent.setResultats(new int[] {0,0,0,0,0});
		assertEquals(0.0, florent.moyenne(), 0.0);
		florent.setResultats(new int[] {0,20,20,10,5});
		assertEquals(11.0, florent.moyenne(), 0.0);
	}
	
	
	@Test 
	void testEquals() {
		Etu florent = new Etu("Janssens","Florent");
		Etu amaury = new Etu("Crenier", "Amaury");
		Etu ludo = new Etu("Kinnaert", "Ludobic");
		Etu cloneFlorent = new Etu("Janssens", "Florent");
		assertFalse(florent.equals(null));
		assertFalse(florent.equals(amaury));
		assertTrue(florent.equals(florent));
		assertFalse(cloneFlorent.equals(florent)); //car 2 obj différents avec matricule différent
	}
	
	@Test
	void testCompareTo() {
		Etu florent = new Etu("Janssens","Florent");
		Etu amaury = new Etu("Crenier", "Amaury");
		Etu ludo = new Etu("Kinnaert", "Ludobic");
		Etu cloneFlorent = new Etu("Janssens", "Florent");
		assertTrue(florent.compareTo(florent) == 0);
		assertTrue(florent.compareTo(amaury) < 0);
		assertTrue(amaury.compareTo(florent) > 0);
		
	}
}
