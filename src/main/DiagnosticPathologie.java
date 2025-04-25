package main;


/**
 * 
 * @author Mohamed Zarrouk
 *
 */
public class DiagnosticPathologie {
	
	/**
	 * Identifie la pathologie du patient en fonction de l'idndex de santé
	 * @param indexDeSante c'est la valeur de l'idndex de santé
	 * @return la pathologie du patient
	 */
	public String diagnosticPatho(Integer indexDeSante) {
		String pathologie = "pathologie non identifiée, la valeur de l'index de santé " + indexDeSante
				+ " n'est pas suporrtée";
		if (indexDeSante != null && indexDeSante != 0) {
			if (indexDeSante % 3 == 0 && indexDeSante % 5 == 0) {
				pathologie = ListePathologies.PATHOLOGIE_CARDIOLOGIE_ET_TRAUMATOLOGIE;
			} else if (indexDeSante % 3 == 0) {
				pathologie = ListePathologies.PATHOLOGIE_CARDIOLOGIE;
			} else if (indexDeSante % 5 == 0) {
				pathologie = ListePathologies.PATHOLOGIE_TRAUMATOLOGIE;
			}
		}

		return pathologie;
	}

}
