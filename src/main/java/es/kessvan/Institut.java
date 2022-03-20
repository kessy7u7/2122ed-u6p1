package es.kessvan;

public class Institut {

	public static void main(String[] args) {
		
		Alumne alumne = new Alumne();
		
		alumne.nom = "Kessvan";
		alumne.cognoms = "Cedeño";
		alumne.cicleFormatiu = "1º DAW";
		alumne.any = 2021;
		
		System.out.println(alumne.toString());

	}

}
