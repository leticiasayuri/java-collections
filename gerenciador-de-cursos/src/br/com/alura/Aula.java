package br.com.alura;

public class Aula implements Comparable<Aula> {
	
	private String titulo;
	
	private int tempo;

	public Aula(String titulo, int tempo) {
		if (titulo == null) {
			throw new IllegalArgumentException("T�tulo n�o pode ser nulo!");
		}
		
		if (tempo <= 0) {
			throw new IllegalArgumentException("Tempo inv�lido!");
		}
		
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
}
