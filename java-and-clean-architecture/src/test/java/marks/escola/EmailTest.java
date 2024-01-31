package marks.escola;

import marks.escola.domain.aluno.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("emailInvalido"));
    }

    @Test
    void DeveCriarEmailComEnderecoValido() {
        String endereco = "email.valido@email.com";
        Email email = new Email(endereco);

        assertEquals(endereco, email.getEndereco());
        assertDoesNotThrow(() -> new Email(endereco));
    }

}