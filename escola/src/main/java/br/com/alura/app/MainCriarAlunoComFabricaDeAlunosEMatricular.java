package br.com.alura.app;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.FabricaDeAluno;

public class MainCriarAlunoComFabricaDeAlunosEMatricular {
	
	public static void main(String[] args) {
		FabricaDeAluno fabricaDeAluno = new FabricaDeAluno();
		
		String nome = "Isaac Newton";
		String cpf = "100.321.987-00";
		String email = "isaac@newton.universe";		
		
		Aluno aluno = fabricaDeAluno
			.comNomeCpfEemail(nome, cpf, email)
			.comTelefone("51", "30503512")
			.comTelefone("11", "989456789")
			.criar();
		
		System.out.println(
			"Novo aluno: " + aluno.getNome() + "\n" +
			"CPF: " + aluno.getCpf() + "\n" +
			"E-mail: " + aluno.getEmail() + "\n" +
			"Telefone: " + aluno.getTelefones().stream().findFirst().get().getNumero());
	}

}
