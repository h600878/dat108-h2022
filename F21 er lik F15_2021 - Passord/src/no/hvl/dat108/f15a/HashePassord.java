package no.hvl.dat108.f15a;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.xml.bind.DatatypeConverter;

public class HashePassord {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        final String[] noenPassord = {"Hei", "Hallaien", "pwd123", "Peace&Love", "4everSecure"};

        for (String passord : noenPassord) {

            final byte[] passordSomBytes = passord.getBytes(StandardCharsets.UTF_8);

            System.out.println();
            System.out.println(passord);
            System.out.println(Arrays.toString(passordSomBytes));

            final MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] digest = md.digest(passordSomBytes);

            System.out.println(Arrays.toString(digest));

            final String base64Digest = Base64.getEncoder().encodeToString(digest);
            final String hexDigest = DatatypeConverter.printHexBinary(digest);

            System.out.println(base64Digest);
            System.out.println(hexDigest);

        }

    }

}
