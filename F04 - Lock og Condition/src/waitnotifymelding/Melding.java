package waitnotifymelding;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Melding {

	private String tekst;
	
	private Lock lock = new ReentrantLock();
	private Condition tekstSatt = lock.newCondition();

	public String getTekst() {
		
		lock.lock();
		try {
			while (!harTekst()) {
				tekstSatt.await();
			}
		} catch (InterruptedException e) {
		} finally {
			lock.unlock();
		}
		return tekst;
	}

	public void setTekst(String tekst) {
		lock.lock();
		try {
			this.tekst = tekst;
			tekstSatt.signalAll();
		} finally {
			lock.unlock();
		}

	}

	public boolean harTekst() {
		return tekst != null;
	}
}
