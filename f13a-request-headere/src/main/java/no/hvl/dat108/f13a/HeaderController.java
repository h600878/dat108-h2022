package no.hvl.dat108.f13a;

import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HeaderController {

    /**
     * Henter ut alle headere
     * @param headers Alle headere
     * @return En string med all dataene fra headerne
     */
    @ResponseBody
    @GetMapping(value = "/headers", produces = "text/plain")
    public String headers(@RequestHeader Map<String, String> headers) {
        // https://www.baeldung.com/java-maps-streams
        // Konverterer ordboken til en mengde med alle veridene til ordboken inni, slik at vi kan bruke .stream()
        return headers.entrySet().stream()
                .map((Entry<String, String> e) -> String.format("Header '%s' = %s", e.getKey(), e.getValue()))
                .collect(Collectors.joining("\n"));
    }

    /**
     * Henter ut Host headeren og viser resultatet på skjermen
     * @param host Host-header
     * @return En string av dataene fra host
     */
    @ResponseBody
    @GetMapping(value = "/host", produces = "text/plain")
    public String host(@RequestHeader(HttpHeaders.HOST) String host) {
        return "host = " + host;
    }

    /**
     * Henter ut accept-language headeren og viser resultatet på skjermen
     * @param spraak Accept-language-header
     * @return En string av dataene fra accept-language
     */
    @ResponseBody
    @GetMapping(value = "/spraak", produces = "text/plain")
    public String spraak(@RequestHeader(HttpHeaders.ACCEPT_LANGUAGE) String spraak) {
        return "accept-language = " + spraak;
    }
}