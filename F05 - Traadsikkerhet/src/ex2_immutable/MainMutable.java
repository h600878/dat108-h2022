package ex2_immutable;

public class MainMutable {

	public static void main(String[] args) {
		
		MeldingMutable m1 = new MeldingMutable("Hallo");
		m1.leggTil(" på do!");
		System.out.println(m1);
		
		m1.setInnhold("Hade på bade!");
		System.out.println(m1);
		// Kan en MeldingMutable deles og brukes av flere tråder samtidig?
		
	}

}
