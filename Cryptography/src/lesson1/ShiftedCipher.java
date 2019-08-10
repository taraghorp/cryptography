/**
 * Author: Tara G
 */

package lesson1;

import java.io.StringWriter;
import java.util.stream.IntStream;

public class ShiftedCipher { //

	public static void main(String[] args) {
		
		ShiftedCipher cipher = new ShiftedCipher();
		String encrypted = cipher.encrypt("cryptoisfun", 25);
		System.out.println("cryptoisfun gets encrypted to " + encrypted);
		String decrypted = cipher.decrypt(encrypted, 25);
		System.out.println(encrypted + " gets decrypted to " + decrypted);
		
	}
	
	static int nfmod(int a, int b){
	 int temp =  (a % b) ;
	 return (temp < 0 ? temp+b : temp);
	}
	
	public String encrypt(String input, int key) {
		
		IntStream intStream = input.toLowerCase().chars().map(i -> i - 97 ).map(i -> nfmod(i + key, 26)).map(i -> i + 97);
		StringWriter sw = new StringWriter();
		intStream.forEach(sw::write);
		return sw.toString();
	}
	
	public String decrypt(String input, int key) {
		
		IntStream intStream = input.toLowerCase().chars().map(i -> i - 97).map(i -> nfmod(i - key ,26)).map(i -> i + 97);
		StringWriter sw = new StringWriter();
		intStream.forEach(sw::write);
		return sw.toString();
	}
}
