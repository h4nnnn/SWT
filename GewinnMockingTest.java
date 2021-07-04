import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Testklasse von GewinnMocking welche den Testfall ohne Mocking und mit Mocking beinhaltet.
 * 
 * 
 * @author Hanning Liu (901350) s82377@beuth-hochschule.de @date 01.07.21 @version v0.5
 *
 */
class GewinnMockingTest {

	GewinnMocking g = new GewinnMocking ();
	
	//Ohne Mock
	@Test
	void gewinnMockingTest() {	
		assertEquals(53, g.gewinnBerechnen(1000));	
	}
	
	
	//Mit Mock
	@Test
	void gewinnMockingTest2() {	
		MargeMocking m = mock(MargeMocking.class);		
		when (m.marge(g.gewinnBerechnen(1000))).thenReturn(1300.0);
		assertEquals(53, g.gewinnBerechnen(1000));	
	}

}
