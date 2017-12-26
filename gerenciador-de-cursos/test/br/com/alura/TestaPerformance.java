package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
	
	public static void main(String[] args) {
		
		Collection<Integer> numerosArrayList = new ArrayList<>();
		
		long inicioAddArrayList = System.currentTimeMillis();
		for (int i = 1; i <= 50000; i++) {
			numerosArrayList.add(i);
		}
		long fimAddArrayList = System.currentTimeMillis();
		long tempoAddArrayList = fimAddArrayList - inicioAddArrayList;
		System.out.println("Tempo add ArrayList: " + tempoAddArrayList);
		
		long inicioContainsArrayList = System.currentTimeMillis();
		for (Integer numero : numerosArrayList) {
			numerosArrayList.contains(numero);
		}		
		long fimContainsArrayList = System.currentTimeMillis();
		long tempoContainsArrayList = fimContainsArrayList - inicioContainsArrayList;		
		System.out.println("Tempo contains ArrayList: " + tempoContainsArrayList);
		
		/*-------------------------------------------------------------------------------*/
		
		Collection<Integer> numerosHashSet = new HashSet<>();
		
		long inicioAddHashSet = System.currentTimeMillis();		
		for (int i = 1; i <= 50000; i++) {
			numerosHashSet.add(i);
		}
		long fimAddHashSet = System.currentTimeMillis();
		long tempoAddHashSet = fimAddHashSet - inicioAddHashSet;
		System.out.println("Tempo add HashSet: " + tempoAddHashSet);		
		
		long inicioContainsHashSet = System.currentTimeMillis();		
		for (Integer numero : numerosHashSet) {
			numerosHashSet.contains(numero);
		}		
		long fimContainsHashSet = System.currentTimeMillis();		
		long tempoContainsHashSet = fimContainsHashSet - inicioContainsHashSet;
		System.out.println("Tempo contains HashSet: " + tempoContainsHashSet);		
	}
}
