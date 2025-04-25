package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.DiagnosticPathologie;
import main.ListePathologies;

/**
 * 
 * @author Mohamed Zarrouk
 *
 */
public class DiagnosticPathologieTest {

	DiagnosticPathologie diagnosticPathologie = new DiagnosticPathologie();

	/**
	 * test en cas d'une pathologie "Cardiologie"
	 */
	@Test
	void testDiagnosticCardiologie() {

		Integer indexDeSante = 33;
		assertEquals(ListePathologies.PATHOLOGIE_CARDIOLOGIE, diagnosticPathologie.diagnosticPatho(indexDeSante));

	}

	/**
	 * test en cas d'une pathologie "Traumatologie"
	 */
	@Test
	void testDiagnosticTraumatologie() {

		Integer indexDeSante = 55;
		assertEquals(ListePathologies.PATHOLOGIE_TRAUMATOLOGIE, diagnosticPathologie.diagnosticPatho(indexDeSante));

	}

	/**
	 * test en cas d'une pathologie "Cardiologie et Traumatologie"
	 */
	@Test
	void testDiagnosticCardiologieTraumatologie() {

		Integer indexDeSante = 15;
		assertEquals(ListePathologies.PATHOLOGIE_CARDIOLOGIE_ET_TRAUMATOLOGIE,
				diagnosticPathologie.diagnosticPatho(indexDeSante));

	}
	
	/**
	 * test Pathologie de tous les index de santé entre 1 et 100
	 */
	@Test
	void testPathologie() {
		for(int i = 1; i<=100; i++) {
			System.out.println(diagnosticPathologie.diagnosticPatho(i));
		}
	}

}
