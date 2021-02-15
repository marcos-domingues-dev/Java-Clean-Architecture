package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CPFTest {

	@Test
	void naoDeveCriarCpfInvalido() {
		assertThrows(
				IllegalArgumentException.class, () -> new CPF(null));
		
		assertThrows(
				IllegalArgumentException.class, () -> new CPF(""));
		
		assertThrows(
				IllegalArgumentException.class, () -> new CPF("cpf1234"));
	}
	
	@Test
	void deveCriarCpfValido() {
		String numeroCpf = "123.456.789-01";
		CPF cpf = new CPF(numeroCpf);
		assertEquals(numeroCpf, cpf.getNumero());
	}

}
