package ex2_immutable;

public class MeldingMutable {
	
	private String innhold;

	public MeldingMutable(String innhold) {
		this.innhold = innhold;
	}

	public String getInnhold() {
		return innhold;
	}

	public void setInnhold(String innhold) {
		this.innhold = innhold;
	}
	
	public void leggTil(String merTekst) {
		innhold += merTekst;
	}

	@Override
	public String toString() {
		return "MeldingMutable [innhold=" + innhold + "]";
	}
}
