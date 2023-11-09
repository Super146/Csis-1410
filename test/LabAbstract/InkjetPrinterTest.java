package LabAbstract;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InkjetPrinterTest {
	
	private InkjetPrinter printer;

	@BeforeEach
	void setUp() throws Exception {
		printer = new InkjetPrinter("Canon TS202");
	}	

	@Test
	void testInkjetPrinter_full() {
		InkjetPrinter p = new InkjetPrinter("Canon Pixma");
		assertEquals(100, p.getRemainingCartridge());
	}

	@Test
	void print_once_reduceCartridgeBy10percent() {
		printer.print();
		assertEquals(90, printer.getRemainingCartridge());
	}	

	@Test
	void print_threeTimes_reduceCartridgeBy30percent() {
		printer.print();
		printer.print();
		printer.print();
		assertEquals(70, printer.getRemainingCartridge());
	}	

	@Test
	void print_elevenTimes_reduceCartridgeUntil0() {
		for (int i = 1; i <= 10; i++) {
			printer.print();
			assertEquals(100 - i * 10, printer.getRemainingCartridge());
		}

		printer.print();
		assertEquals(0, printer.getRemainingCartridge());
	}

	@Test
	void refillCartridge_full_remainsFull() {
		printer.refillCartridge();
		assertEquals(100, printer.getRemainingCartridge());
	}	

	@Test
	void refillCartridge_notFull_fillsUpTo100() {
		for (int i = 0; i < 5; i++) {
			printer.print();
		}
		printer.refillCartridge();
		assertEquals(100, printer.getRemainingCartridge());
	}
}
