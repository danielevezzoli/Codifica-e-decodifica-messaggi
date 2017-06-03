package it.unibs.ing.ieee.codifica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Codificatore {
	
	static Map<StringBuffer, Integer> codebook = new HashMap<>();

	public static List<Integer> codifica(List<Character> messaggio) {
		
		List<Integer> output = new ArrayList<>();
		List<Character> tmp = messaggio.stream().distinct().collect(Collectors.toList());

		for (int i = 0; i < tmp.size(); i++) {
			codebook.put(new StringBuffer(tmp.get(i)), i + 1);
		}
		
		StringBuffer npla = new StringBuffer(String.valueOf(messaggio.get(0)));
		while (messaggio.size() > 0) {
			
			int i = 1;
			
			do {
				npla = npla.append(messaggio.get(i));
				i++;
			} while(codebook.containsKey(npla) && i<npla.length());
			
			
			codebook.put(npla, codebook.size()+1);
			
			StringBuffer first = new StringBuffer(npla.substring(0,npla.length()-1));
			
			output.add(codebook.get(first));
			
			messaggio = messaggio.subList(first.length()-1, messaggio.size());
			
		}
		
		return output;
	}

	public static StringBuffer decodifica(Integer[] sequenza) {
		return null;
	}
}
