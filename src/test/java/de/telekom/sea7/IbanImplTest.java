package de.telekom.sea7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IbanImplTest {

	private IbanImpl cut;

	@BeforeEach

	void setup() {

		cut = new IbanImpl();

	}

	@Test

	    void getIban_test() {

	       cut.setIban("DE123456789");
	       
	        var result = cut.getIban();

	        assertSame("DE123456789", result);
	}

	@Test
	void getiban_id_test() {

		cut.setIban_id(1);

		var result = cut.getIban_id();

		assertNotSame(2, result);

	}

	@AfterEach

	void teardown() {

		cut = null;

	}

}
