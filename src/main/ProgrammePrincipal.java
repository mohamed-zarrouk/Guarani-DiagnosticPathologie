package main;

/**
 * 
 * @author Mohamed Zarrouk
 *
 */
public class ProgrammePrincipal {

	public static void main(String[] args) {
		DiagnosticPathologie diagnosticPathologie = new DiagnosticPathologie();
		
		Integer indexDeSanteCardiologie = 33;
		Integer indexDeSanteTraumatologie = 55;
		Integer indexDeSanteCardiologieTraumatologie = 15;
		
		System.out.println("Pour l'index de santé "+indexDeSanteCardiologie+", l'unité médicale est : "
				+diagnosticPathologie.diagnosticPatho(indexDeSanteCardiologie));
		
		System.out.println("Pour l'index de santé "+indexDeSanteTraumatologie+", l'unité médicale est : "
				+diagnosticPathologie.diagnosticPatho(indexDeSanteTraumatologie));
		
		System.out.println("Pour l'index de santé "+indexDeSanteCardiologieTraumatologie+", l'unité médicale est : "
				+diagnosticPathologie.diagnosticPatho(indexDeSanteCardiologieTraumatologie));

	}

}
