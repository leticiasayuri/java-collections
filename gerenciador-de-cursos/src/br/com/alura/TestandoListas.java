package br.com.alura;

import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {
		String curso1 = "Design Patterns Java I: Boas pr�ticas de programa��o";
		String curso2 = "Testes: TDD com Java";
		String curso3 = "Java: Dominando as collections";
		
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		System.out.println(cursos);
		
		//Removendo elementos de uma lista
		cursos.remove(1);
		System.out.println(cursos);
		
		//Acessando elementos da lista
		System.out.println("O primeiro curso da lista �: " + cursos.get(0));
	}
}
