package tp05;
/**
 * @author florent janssenss
 *
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class IndependantTest {

	@Test
	public void testToString() {
		Independant i = new Independant("Dewulf", "Arnaud", 1234, "BE123456");
		assertEquals("Nom: Dewulf\nPr�nom: Arnaud\nRN: 1234\nTVA: BE123456", i.toString());
	}

}