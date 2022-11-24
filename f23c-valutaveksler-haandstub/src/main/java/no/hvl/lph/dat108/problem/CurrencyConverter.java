package no.hvl.lph.dat108.problem;

import java.io.IOException;

public class CurrencyConverter {

	public double convertAmount(double fromAmount, String fromCurrencyParameter, String toCurrencyParameter) {
		
		double toAmount = 0;
		
		ExchangeRate exchangeRate;
		try {
			exchangeRate = ExchangeRateService.getRate(fromCurrencyParameter, toCurrencyParameter);
			toAmount = fromAmount * exchangeRate.rate;
		} catch (IOException e) {
			// returning default toAmount;
		}
		return toAmount;
	}
}
