package no.hvl.dat108.webshop.util;

import no.hvl.dat108.webshop.model.Cart;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginUtil {

    private final static int MAX_INTERACTIVE_INTERVAL = 60;

    public static void loggUtBruker(HttpSession session) {
        session.invalidate(); // Avslutter sesjonen
    }

    public static void loggInnBruker(HttpServletRequest request, String username) {
        loggUtBruker(request.getSession()); // Logger ut brukeren om han allerede er logget inn

        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(MAX_INTERACTIVE_INTERVAL); // Logger ut brukeren etter gitt tid med inaktivitet

        session.setAttribute("username", username);
        session.setAttribute("cart", new Cart());
    }

    public static boolean erBrukerInnlogget(HttpSession session) {
        return session != null && session.getAttribute("username") != null;
    }

}
