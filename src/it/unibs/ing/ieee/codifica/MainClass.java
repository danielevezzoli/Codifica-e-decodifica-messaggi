package it.unibs.ing.ieee.codifica;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
//		StringBuffer input = new StringBuffer("bcababbcbccbbcbab");
		StringBuffer input = new StringBuffer("abc");
		System.out.println(input + " " + input.length());
		
		List<Integer> sequenza = Codificatore.codifica(toCharList(input));
		System.out.println(sequenza + " " + sequenza.size());
//		
//		String[] elementi16 = Convertitore.convertiBase16(sequenza);
//		System.out.println(elementi16 + " " + elementi16.length);
//		
//		SpecialByte[] payload = Pacchettizzatore.pacchettizza(elementi16);
//		System.out.println(payload + " " + payload.length);
//		

	}
	
	public static List<Character> toCharList(StringBuffer sb) {
		List<Character> tmp = new ArrayList<>();
		for (int i=0; i<sb.length(); i++) {
			tmp.add(sb.charAt(i)); 
		}
		
		return tmp;
	}

}
