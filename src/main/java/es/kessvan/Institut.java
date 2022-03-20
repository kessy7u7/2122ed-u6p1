package es.kessvan;

public class Institut {

	private static final int ANY = 2021;
	private static final String CICLE_FORMATIU = "1º DAW";
	private static final String COGNOMS_ALUMNE = "Cedeño";
	private static final String NOM_ALUMNE = "Kessvan";

	public static void main(String[] args) {
		
		Alumne alumne = new Alumne();
		
		alumne.nom = NOM_ALUMNE;
		alumne.cognoms = COGNOMS_ALUMNE;
		alumne.cicleFormatiu = CICLE_FORMATIU;
		alumne.any = ANY;
		
		System.out.println(alumne.toString());

	}

}
