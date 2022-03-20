package es.kessvan;

public class School {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.n = "Kessvan";
		p.c = "Cedeño";
		p.cl = "1º DAW";
		p.a = 2021;
		
		System.out.println(p.toString());

	}

}
