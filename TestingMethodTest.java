import static org.junit.jupiter.api.Assertions.*;

/**
 * Die JUnit von TestingMethod.java
 * 
 * Autor: Hanning (901350) s82377@beuth-hochschule.de Datum: 01.07.21 v0.2
 */

import org.junit.jupiter.api.Test;
/**
 * Die Testklasse von TestingMethod, welche den ersten Teil der Aufgabe beinhaltet.
 * Dabei wurde wie gewuenscht verschiedene Tests ausgefuehrt, zudem noch ein Beispiel fuer einen BadCode und eine Behandlung von einer Exception.
 * 
 * @author Hanning Liu (901350) s82377@beuth-hochschule.de @date 01.07.21 @version v0.2
 *
 */
class TestingMethodTest {

	TestingMethod test = new TestingMethod();
	
	
	//Viereck
	@Test
	void testUmfangViereck() {
		assertEquals(10, test.umfangViereck(2, 3));
	}
	
	@Test
	void testFlaecheViereck() {
		assertEquals(6, test.flaecheViereck(2, 3)); //BAD CODE -> absichtlicher Fehler
	}
	
	//Kreis
	@Test
	void testUmfangKreis() {
		assertEquals("18,85", test.umfangKreis(3));
	}
	
	@Test
	void testFlaecheKreis() {
		assertEquals("28,27", test.flaecheKreis(3));
	}
	
	//Wurzel	
	@Test
	void testWurzel() {
		assertEquals(2, test.wurzel(4));
	}
	
	@Test
	void testWurzelException() {
		assertThrows(IllegalArgumentException.class, () -> {test.wurzel(-2); }); //Exception Behandlung
	}




}
