package br.com.alura;

import java.util.List;

public class TestaCurso {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira"); 
		
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
		aulas.add(new Aula("Trabalhando com ArrayList", 21));
		System.out.println(aulas);
		System.out.println(javaColecoes.getAulas());
		
		System.out.println(aulas == javaColecoes.getAulas()); // true, pois s�o refer�ncias para o mesmo objeto
	}

}
