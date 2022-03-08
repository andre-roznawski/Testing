package de.telekom.sea7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DepotImplTest {

	private DepotImpl<IbanImpl> cut;

	@BeforeEach

	void setup() {

		cut = new DepotImpl<IbanImpl>();

	}

	@Test
	void get_test() {

//Arrange
		IbanImpl iban1 = new IbanImpl();
		iban1.setIban_id(1);
		iban1.setIban("DE123456789");
//Act
		cut.add(iban1);
//Assert
		IbanImpl result = cut.get(1);

		assertNull(result);
		result = cut.get(0);
		var klasse = cut.get(0).getClass().getCanonicalName();
		assertNotNull(result);
		assertEquals(1, result.getIban_id());
		assertEquals("DE123456789", result.getIban());
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> cut.get(9));
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> cut.get(-1));
		assertEquals("de.telekom.sea7.IbanImpl",klasse);
	}

	@Test
	void add_test() {
//Arrange
		IbanImpl iban1 = new IbanImpl();
		iban1.setIban_id(1);
		iban1.setIban("DE123456789");
//Act
		// for(int i=0; i<10; i++) cut.add(iban1);
  		// boolean result1;
//Assert
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			for (int i = 0; i < 10; i++)
				cut.add(iban1);
		});
	}
	@Test
	void size_test() {

		// Arrange
		IbanImpl iban1 = new IbanImpl();
		
		// Act
		var result = cut.size();
		assertEquals(0, result);
		iban1.setIban_id(1);
		iban1.setIban("DE123456789");
		for (int i = 0; i < 9; i++) {
			cut.add(iban1);
		}
		// Assert
		result = cut.size();
		assertEquals(9, result);

	}

//	@Test
//	void getiban_id_test() {
//
//		cut.setIban_id(1);
//
//		var result = cut.getContent();
//
//		assertNotSame(2, result);
//
//	}
//	
//	@Test
//	void getiban_id_test() {
//
//		cut.setIban_id(1);
//
//		var result = cut.getContent();
//
//		assertNotSame(2, result);
//
//	}

	@AfterEach

	void teardown() {

		cut = null;

	}

}
