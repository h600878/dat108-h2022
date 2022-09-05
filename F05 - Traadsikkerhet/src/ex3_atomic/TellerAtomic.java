package ex3_atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class TellerAtomic {

    // Atomisk variabel, trådsikker
    private final AtomicInteger verdi = new AtomicInteger();

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
