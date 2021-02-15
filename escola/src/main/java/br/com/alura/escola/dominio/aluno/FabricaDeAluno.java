package br.com.alura.escola.dominio.aluno;

// Builder Pattern

public class FabricaDeAluno {

	private Aluno aluno;

	public FabricaDeAluno comNomeCpfEemail(String nome, String cpf, String email) {
		this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
		return this;
	}

	public FabricaDeAluno comTelefone(String ddd, String numero) {
		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}

	// build
	public Aluno criar() {
		return aluno;
	}

}
