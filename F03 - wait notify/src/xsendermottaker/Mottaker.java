package xsendermottaker;

public class Mottaker extends Thread {

    private final Melding melding;

    public Mottaker(Melding melding) {
        this.melding = melding;
    }

    @Override
    public void run() {

        while (true) {
            try {
                //noinspection BusyWait
                sleep(10_000);
            }
            catch (InterruptedException ignored) {
            }

            synchronized (melding) {
                while (melding.erMeldingLest()) {
                    try {
                        melding.wait();
                    }
                    catch (InterruptedException ignored) {
                    }
                }
                String mottattTekst = melding.getTekst();
                melding.notifyAll();
                System.out.println("Mottaker har mottatt melding " + mottattTekst);
            }
        }
    }

}
