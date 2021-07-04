import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Testklasse von MoreMethods, welche die beinhalteten Methoden testet.
 * 
 * @author Hanning Liu (901350) s82377@beuth-hochschule.de @date 01.07.21 @version v0.2
 *
 */
class MoreMethodsTest {

	MoreMethods test = new MoreMethods();
	
	@Test
	void zeichenToEuroTest() {
		assertEquals(2, test.zeichenToEuro("2€"));
	}
	
	@Test
	void zeichenToEuroTest2() {
		assertEquals(0, test.zeichenToEuro("€"));
	}
	
	@Test
	void zeichenToEuroTest3() {
		assertEquals(0, test.zeichenToEuro("dklgrtj"));
	}
	
	@Test
	void zeichenToEuroTestException() {
		assertThrows(NumberFormatException.class, () -> {test.zeichenToEuro("zwei"); }); //Behandlung einer Exception
	}
	
	@Test
	void zeichenToHonorarTest() {
		assertEquals(1, test.zeichenToHonorar("1234567890"), "Fehlgeschlagen");
	}
	
	@Test
	void zeichenToHonorarTest2() {
		assertEquals(0.8, test.zeichenToHonorar("€²³³{6{["), "Fehlgeschlagen");
	}
	
	@Test
	void countPicturesTest() {
		assertEquals(2, test.countPictures("Ich habe ein picture. Und an die der anderen Wand habe ich ein weiteres Picture!"));
	}
	
	@Test
	void countPicturesTest2() {
		assertEquals(0, test.countPictures("pic ture"));
	}
	
	@Test
	void countPicturesTest3() {
		assertEquals(1, test.countPictures("PICTURE"));
	}
	
	@Test
	void countPicturesTestBadCode() {
		assertEquals(2, test.countPicturesBadCode("Ich habe ein picture. Und an die der anderen Wand habe ich ein weiteres Picture!")); //BadCode -> absichtlicher Fehler
	}
	

}
