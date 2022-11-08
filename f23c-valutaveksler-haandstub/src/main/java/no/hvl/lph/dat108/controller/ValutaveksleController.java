package no.hvl.lph.dat108.controller;

import java.util.Currency;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import no.hvl.lph.dat108.solution.CurrencyConverter;

@Controller 
public class ValutaveksleController {

	@GetMapping("/valutaveksling")
	@ResponseBody
	public String veksle(@RequestParam String amount, @RequestParam String fromCurrency, @RequestParam String toCurrency){
		
		double fromAmount = Double.parseDouble(amount);
		
		//JUnit enhetstesting av denne!
		CurrencyConverter cc = new CurrencyConverter();
		double toAmount = cc.convertAmount(fromAmount, fromCurrency, toCurrency);

		Locale norsk = new Locale("no", "NO");
		String fromCurrencyDisplayName = Currency.getInstance(fromCurrency).getDisplayName(norsk);
		String toCurrencyDisplayName = Currency.getInstance(toCurrency).getDisplayName(norsk);

		return """
			<!DOCTYPE html>
			<html><body>
				<h1>Valutaveksling resultat</h1>
				<p>""" 	+ fromAmount + " " + fromCurrencyDisplayName + " blir " 
						+ toAmount + " " + toCurrencyDisplayName + ".</p>"
			 + "<a href=\"index.html\">Veksle en gang til</a></body></html>";
	}
}
