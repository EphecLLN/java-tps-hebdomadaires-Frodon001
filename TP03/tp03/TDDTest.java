package tp03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TDDTest {

	@Test
	void testEstPair() {
		ExerciceTDD e = new ExerciceTDD();
		assertEquals(true, e.estPair(2));
		assertEquals(false, e.estPair(3));
		assertEquals(true, e.estPair(0));
	}
	@Test
	void testPerimCarre() {
		ExerciceTDD e = new ExerciceTDD();
		assertEquals(4.0, e.perimetreCarre(1.0));
	}
	@Test
	void testContientCaractere() {
		ExerciceTDD e = new ExerciceTDD();
		assertEquals(true, e.contientChar('z', "zarbi"));
	}

}
