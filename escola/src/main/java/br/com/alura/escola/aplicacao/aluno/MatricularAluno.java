package br.com.alura.escola.aplicacao.aluno;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno { // -> Use case
	
	private final RepositorioDeAlunos repositorio; // -> Repository
	
	public MatricularAluno(RepositorioDeAlunos repositorio) {
		this.repositorio = repositorio;
	}

	// Command Pattern
	public void executar(MatricularAlunoDto dados) {
		Aluno aluno = dados.criarAluno();		
		repositorio.matricular(aluno); // -> Business Rules		
	}

}
