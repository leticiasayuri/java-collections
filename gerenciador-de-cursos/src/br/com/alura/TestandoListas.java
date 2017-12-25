package br.com.alura;

import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {
		String curso1 = "Design Patterns Java I: Boas práticas de programação";
		String curso2 = "Testes: TDD com Java";
		String curso3 = "Java: Dominando as collections";
		
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		System.out.println(cursos);
	}
}
