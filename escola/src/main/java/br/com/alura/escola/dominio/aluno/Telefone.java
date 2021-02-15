package br.com.alura.escola.dominio.aluno;

public class Telefone {
	
	// VALUE OBJECT

	private String ddd;
	private String numero;

	public Telefone(String ddd, String numero) {
		if (ddd == null || numero == null) {
			throw new IllegalArgumentException("DDD e Número do telefonte são obrigatórios.");
		}		
		if (!ddd.matches("\\d{2}")) {
			throw new IllegalArgumentException("DDD do telefone inválido.");
		}		
		if (!numero.matches("\\d{8}|\\d{9}")) {
			throw new IllegalArgumentException("Número do telefone inválido.");
		}
		
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getDdd() {
		return ddd;
	}

	public String getNumero() {
		return numero;
	}

}
