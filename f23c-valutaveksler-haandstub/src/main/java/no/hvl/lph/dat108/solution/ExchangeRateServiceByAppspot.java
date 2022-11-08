package no.hvl.lph.dat108.solution;


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ExchangeRateServiceByAppspot implements ExchangeRateService {
    
	//All requests made to the API must hold a custom HTTP header named "apikey".
	//API-key: Nr4gP4i44bwjzFZ50xHJp9z6ymWOzfTJ
	
    // Home and documentation:
	// https://currency-api.appspot.com/
	//
	// Example URL:
    // https://currency-api.appspot.com/api/USD/EUR.json
	//
    // Example JSON Result:
    // {"success":true,
	//	"source":"USD",
	//	"target":"EUR",
	//	"rate":"0.8996300",
	//	"amount":0.9,
	//	"message":""}
    
    /* (non-Javadoc)
	 * @see solution.ExchangeRateService#getRate(java.lang.String, java.lang.String)
	 */
    @Override
	public ExchangeRate getRate(String source, String target) throws IOException {
        
    	String baseUrl = "https://currency-api.appspot.com/api/";
    	String format = "json";
    	
        String queryString = baseUrl + source + "/" + target + "." + format;
        
        URL googleCcApiUrl = new URL(queryString);
        Reader apiReader = new InputStreamReader(googleCcApiUrl.openStream());

        ExchangeRate exRate = new ObjectMapper().readValue(apiReader, ExchangeRate.class);
        return exRate;
//        Gson gson = new Gson();
//        return gson.fromJson(apiReader, ExchangeRate.class);
    }

}
