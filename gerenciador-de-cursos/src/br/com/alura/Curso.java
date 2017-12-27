package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;

	private String instrutor;

	private List<Aula> aulas = new ArrayList<>();
	
	private Set<Aluno> alunos = new HashSet<>();
	
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Map<Integer, Aluno> getMatriculaParaAluno() {
		return matriculaParaAluno;
	}

	public void setMatriculaParaAluno(Map<Integer, Aluno> matriculaParaAluno) {
		this.matriculaParaAluno = matriculaParaAluno;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}	
	
	public Aluno buscaAlunoPorMatricula(int matricula) {
		if (!matriculaParaAluno.containsKey(matricula)) {
			throw new NoSuchElementException();
		}
		return matriculaParaAluno.get(matricula);
	}	
	
	@Override
	public String toString() {
		return "[Curso: " + this.nome + ", tempo total: " + this.getTempoTotal() + ", " + "aulas: " + this.aulas + "]";
	}

}
