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
class DateTest {

	@Test
	void testDate() {
		Date d = new Date(20,03,1999);
		assertEquals(20, d.getJour());
		assertEquals(03, d.getMois());
		assertEquals(1999, d.getAnnee());
	}

}
