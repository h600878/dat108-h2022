package no.hvl.dat108.f02;

public class TiTraader {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		Runnable r = new MinRunnable();
		
		for (int i=1; i<=10; i++) {
			Thread t = new Thread(r, "Tråd #" + i);
			t.start();
		}
	}
}

class MinRunnable implements Runnable {
	@Override
	public void run() {
		String navn = Thread.currentThread().getName();
		System.out.println("Hallo fra " + navn);
	}
}
