package br.com.alura.escola.aplicacao.aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() { // -> Teste de integração
		
		/* Usar MOCKITO para teste unitário */
		
		// Given
		String nomeAluno = "Smauel Domiungues";
		String cpfAluno = "123.456.789-00";
		String emailAluno = "samucavenom@gmail.com";

		MatricularAlunoDto dados = new MatricularAlunoDto(nomeAluno, cpfAluno, emailAluno);
		
		// When
		RepositorioDeAlunos repositorio = new RepositorioDeAlunosEmMemoria();
		MatricularAluno useCase = new MatricularAluno(repositorio);
		useCase.executar(dados);
		
		// Then
		Aluno matriculado = repositorio.findByCpf(new CPF(cpfAluno));
		assertEquals(nomeAluno, matriculado.getNome());
		assertEquals(cpfAluno, matriculado.getCpf());
		assertEquals(emailAluno, matriculado.getEmail());		
	}

}
