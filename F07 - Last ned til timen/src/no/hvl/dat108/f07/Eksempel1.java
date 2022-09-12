package no.hvl.dat108.f07;

import java.util.Random;

public class Eksempel1 {

	public static void main(String[] args) {
		/*
		 * Opprett og start 2 tråder som kjører doSomeWildStuff() samtidig.
		 */
	}
	
	public static void doSomeWildStuff() {
		Random r = new Random();
		for (int i=1; i<=10; i++) {
				System.out.println(i);
			try {
				Thread.sleep(r.nextInt(100));
			} catch (InterruptedException e) {
			}
		}
	}
}
