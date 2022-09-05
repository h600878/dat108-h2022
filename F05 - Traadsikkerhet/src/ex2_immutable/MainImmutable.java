package ex2_immutable;

public class MainImmutable {

	public static void main(String[] args) {
		
		MeldingImmutable m2 = new MeldingImmutable("Hallo");
		MeldingImmutable m3 = m2.lagtTil(" på do!");
		System.out.println(m3);
		
		MeldingImmutable m4 = new MeldingImmutable("Hade på bade!");
		System.out.println(m4);
		// Kan en MeldingImmutable deles og brukes av flere tråder samtidig?
		
	}

}
