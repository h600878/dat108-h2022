package no.hvl.dat108.f02;

public class RaceCondition {

	public static void main(String[] args) throws InterruptedException {
		
		final int N = 100000;
		
		Teller teller = new Teller();
		
		Thread telleOppTraad = new TelleOppTraad(teller, N);
		Thread telleNedTraad = new TelleNedTraad(teller, N);
		
		telleOppTraad.start();
		telleNedTraad.start();
		
		//Vente til begge trådene er ferdige
		telleOppTraad.join();
		telleNedTraad.join();
		
		System.out.println("Ferdig! Tellerverdi = " + teller.getVerdi());

	}

}
