package br.com.alura;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestandoIterator {

	public static void main(String[] args) {
		
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");
		
		letras.forEach(letra -> {
			System.out.println(letra);
		});
		
		Iterator<String> itLetras = letras.iterator();
		while (itLetras.hasNext()) {
			System.out.println(itLetras.next());
		}
	}
}
