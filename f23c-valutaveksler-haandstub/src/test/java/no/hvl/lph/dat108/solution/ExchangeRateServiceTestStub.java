package no.hvl.lph.dat108.solution;

import java.io.IOException;

public class ExchangeRateServiceTestStub implements ExchangeRateService {

	@Override
	public ExchangeRate getRate(String source, String target) {
		ExchangeRate exchangeRate = new ExchangeRate();
		exchangeRate.rate = 8.52;
		return exchangeRate;
	}

}
