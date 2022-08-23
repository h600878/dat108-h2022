package no.hvl.dat108.f01;

public class HalloMain {

	public static void main(String[] args) throws InterruptedException {
		
/*
 * Det er to hovedmåter (extends Thread og implements Runnable) 
 * og 5 varianter i hvordan man kan opprette en tråd.
 */
		
// #1	Thread t = new MinTraad();
		
// #2	Thread t = new Thread() {
//			@Override
//			public void run() {
//				System.out.println("Hallo fra anonym Thread");
//			}
//		};
		
// #3	Thread t = new Thread(new MinRunnable());
		
// #4
		Thread t = new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("Hallo fra anonym Runnable");
			}
		});
		
// #5
//		Thread t = new Thread(() 
//				-> System.out.println("Hallo fra lambda-Runnable"));

		t.start();
		
//		for (int i=1; i<=15; i++) {
//			Thread tt = new Thread(new Runnable(){
//				@Override
//				public void run() {
//					System.out.println("Hallo fra "
//							+ Thread.currentThread().getName());
//				}
//			}, "tråd " + i);
//			tt.start();
//		}
		
		for (int i=1; i<=15; i++) {
			final String traadnavn = "tråd " + i;
			Thread tt = new Thread(new Runnable(){
				@Override
				public void run() {
					System.out.println("Hallo fra " + traadnavn);
							
				}
			});
			tt.start();
		}
		
		Thread.sleep(6);
		
		System.out.println("Hallo fra main");
	}

}
