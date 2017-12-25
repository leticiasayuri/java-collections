package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		Aula aula1 = new Aula("Revisando as ArrayLists", 21);
		Aula aula2 = new Aula("Listas de objetos", 20);
		Aula aula3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		System.out.println(aulas);		
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		// Ordenando a lista com outro critério, diferente do estabelecido no compareTo
		// No caso, quero ordenar as Aulas comparando o tempo das mesmas, e para obter o tempo, usa-se o getTempo
		// A frase aqui é semelhante a "ordene estas aulas utilizando como comparação o retorno do método getTempo de cada Aula".
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		// Podemos fazer o mesmo que acima com
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
	}
}
