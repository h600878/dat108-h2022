package no.hvl.dat108.f15a;

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

            final byte[] passordSomBytes = passord.getBytes(StandardCharsets.UTF_8); // Konverterer String til byte[]

            System.out.println();
            System.out.println(passord); // Selve passordet
            System.out.println(Arrays.toString(passordSomBytes)); // En tabell av ascii verdiene til passordet

            // Oppretter en hashing hjelpeklasse med SHA-256 algoritmen
            final MessageDigest md = MessageDigest.getInstance("SHA-256");
            // Hasher byte[] til en ny ugjenkjennelig byte[]
            final byte[] digest = md.digest(passordSomBytes);

            System.out.println(Arrays.toString(digest));

            // To ulike måter å konvertere en byte[] til en String
            final String base64Digest = Base64.getEncoder().encodeToString(digest); // Base64 har et alfabet med 64 ulike tegn
            final String hexDigest = DatatypeConverter.printHexBinary(digest); // Bruker hexadesimaltall, 64 antall siffer

            System.out.println(base64Digest);
            System.out.println(hexDigest);

        }

    }

}
