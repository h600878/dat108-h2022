package no.hvl.lph.dat108.solution;

import java.io.IOException;

public interface ExchangeRateService {

	ExchangeRate getRate(String source, String target)
			throws IOException;

}