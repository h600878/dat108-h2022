package no.hvl.dat108.f09;

import java.util.Random;

public class Eksempel2 {
	
	public static void main(String[] args) {
		Integer tall = muligensEtTall();
	}
	
	private static Integer muligensEtTall() {
		int r = new Random().nextInt();
		return r % 2 == 0 ? r : null;
	}
}
