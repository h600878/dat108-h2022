package ex3_atomic;

public class TelleOppTraad extends Thread {

	private final TellerAtomic teller;
	private final int antallGanger;

	public TelleOppTraad(TellerAtomic teller, int antallGanger) {
		this.teller = teller;
		this.antallGanger = antallGanger;
	}

	@Override
	public void run() {
		for (int i = 0; i < antallGanger; i++) {
				// Kristisk seksjon
				teller.tellOpp(); 
		}
	}

}
