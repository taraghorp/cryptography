/**
 * Author: Tara G
 */

package lesson1;

import java.io.StringWriter;
import java.util.stream.IntStream;

public class VigenereCipher {

	public static void main(String[] args) {
		
		VigenereCipher cipher = new VigenereCipher();
		String encrypted = cipher.encrypt("seeyouatnoon", "spy");
		System.out.println("seeyouatnoon gets encrypted to " + encrypted);
				
	}
	
	static int nfmod(int a, int b){
	 int temp =  (a % b) ;
	 return (temp < 0 ? temp+b : temp);
	}
	static int charToNumber(char w) {
		return ((int)w) - 97;
	}
	static char numberToChar(int n) {
		return (char)(nfmod(n, 26) + 97);
	}
	
	public String encrypt(String input, String key) {
		
		/* Yikes - the issue is key can have less chars than input
		 * so we repeat the key once we reach an end, so key[i % key.length()] does that part
		 * It took me 6 hours to get the below expression right !!!
		 */
		
		IntStream keyStream = IntStream.range(0, input.length())
				.map(i -> charToNumber(input.charAt(i)) + charToNumber(key.charAt(nfmod(i, key.length()))))
				.map(k -> numberToChar(k));
				
		StringWriter sw = new StringWriter();
		keyStream.forEach(sw::write);
		return sw.toString();
	}
	
	
}
