package br.com.alura.app;

import br.com.alura.escola.aplicacao.aluno.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.MatricularAlunoDto;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

/* Interface com o usuário  */

public class MainMatricularAlunoPorLinhaDeComando {
	
	public static void main(String[] args) {

		String nomeAluno = "Smauel Domiungues"; 		// -- args[1]
		String cpfAluno = "972.621.400.09";				// -- args[2]
		String emailAluno = "samucavenom@gmail.com";	// -- args[3]	

		MatricularAlunoDto dados = new MatricularAlunoDto(nomeAluno, cpfAluno, emailAluno);
		
		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());		
		matricular.executar(dados);				
	}

}
