package waitnotify;

public class Main {

	private static String melding;

	public static void main(String[] args) {

		Object lock = new Object();

		Thread printlnTraad = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (lock) {
					while (melding == null) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
						}
					}
				}
				System.out.println(melding);
			}
		});

		Thread giVerdiTraad = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized(lock) {
					melding = "Hallo";
					lock.notifyAll();
				}
			}
		});

		printlnTraad.start();
		giVerdiTraad.start();
	}

}
