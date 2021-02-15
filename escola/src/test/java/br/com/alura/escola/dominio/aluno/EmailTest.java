package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void naoDeveCriarEmailInvalidos() {
		assertThrows(
				IllegalArgumentException.class, () -> new Email(null));
		
		assertThrows(
				IllegalArgumentException.class, () -> new Email(""));
		
		assertThrows(
				IllegalArgumentException.class, () -> new Email("emailinvalido"));
	}
	
	@Test
	void deveCriarEmailValido() {
		assertInstanceOf(Email.class, new Email("marcos@domingues.dev"));
	}

}
