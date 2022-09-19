package no.hvl.dat108.f09;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalTime;
import java.util.Base64;
import java.util.stream.LongStream;

/*
 * Fikk ikke sett på. Poenget her var muligheten for parallelle strømmer
 * for å utnytte flere kjerner/prosessorer.
 */
public class Eksempel5 {

	public static void main(String[] args) {

		System.out.println("Starter mining. Arbeider ...");
		long starttid = System.nanoTime();
		try {

			mineBitcoin();

		} finally {
			long slutttid = System.nanoTime();
			LocalTime tidsbruk = LocalTime.ofNanoOfDay(slutttid - starttid);
			System.out.println("Tidsforbuk = " + tidsbruk);
		}
	}

	private static void mineBitcoin() {

		LongStream.iterate(0, x -> x + 1)
//				.parallel() //Her er trikset!
				.filter(i -> hashOf(i).startsWith("0000"))
				.limit(3)
				.forEach(i -> System.out.println(i + " -> " + hashOf(i)));
	}

	private static String hashOf(long number) {
		byte[] bytes = null;
		try {
			bytes = String.valueOf(number).getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		try {
			return Base64.getEncoder().encodeToString(
					MessageDigest.getInstance("SHA-256").digest(bytes));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}
}
