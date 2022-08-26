package no.hvl.dat108.f02;

public class MinTraad extends Thread {
	
	boolean fortsette = true;
	
	public MinTraad(String navn) {
		super(navn);
	}
	
	public void stopp() {
		fortsette = false;
	}
	
	@Override
	public void run() {
		while(fortsette) {
			System.out.println("Hei");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("tråden avsluttes");
	}
}




