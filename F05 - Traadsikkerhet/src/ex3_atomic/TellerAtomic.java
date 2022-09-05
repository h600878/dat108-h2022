package ex3_atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class TellerAtomic {

	private AtomicInteger verdi = new AtomicInteger();

	public void tellOpp() {
		verdi.incrementAndGet();
	}

	public void tellNed() {
		verdi.decrementAndGet();
	}

	public int getVerdi() {
		return verdi.get();
	}

}
