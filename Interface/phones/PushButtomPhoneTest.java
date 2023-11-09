package phones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Tests the public methods from class PushButtonPhone.
 * 
 * = = = This test class should not be modified. = = =
 */
class PushButtomPhoneTest {
	
	@Test
	void pushButtonPhone_initializesFields() {
		PushButtomPhone pushButtomPhone1 = new PushButtomPhone(
				"Avaya 9611G IP", new Dimension(249.87, 199.9, 70.1), Voltage.V110);

		assertEquals("Avaya 9611G IP (249.9 x 199.9 x 70.1) V110 not connected", 
				pushButtomPhone1.toString());
	}

	@Test
	void call_returnsMessageIncludingTheNumberProvided() {
		PushButtomPhone pushButtomPhone2 = new PushButtomPhone(
				"Cortelco 2500", new Dimension(178, 228, 127), Voltage.DUAL); 

		assertTrue(pushButtomPhone2.call(8015817200L).matches("Pushing buttons to call 8015817200.?")); 
	}
}
