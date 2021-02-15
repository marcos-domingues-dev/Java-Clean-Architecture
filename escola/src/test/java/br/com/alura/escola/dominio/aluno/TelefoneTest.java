package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TelefoneTest {

	@Test
	void naoDeveCriarTelefoneInvalido() {
		assertThrows(
				IllegalArgumentException.class, () -> new Telefone(null, null));
		
		assertThrows(
				IllegalArgumentException.class, () -> new Telefone("", ""));
		
		assertThrows(
				IllegalArgumentException.class, () -> new Telefone("abc", "123"));
		
		assertThrows(
				IllegalArgumentException.class, () -> new Telefone("123", "abc"));
	}
	
	@Test
	void criarTelefoneValido() {
		assertDoesNotThrow(() -> new Telefone("51", "30593512"));
	}

}
