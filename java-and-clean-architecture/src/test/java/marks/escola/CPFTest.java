package marks.escola;

import marks.escola.domain.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {
    @Test
    void naoDeveriaCriarCPFComCPFInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("000000000/00"));
    }

    @Test
    void DeveCriarCPFComCPFValido() {
        String numero = "000.000.000-00";
        CPF cpf = new CPF(numero);

        assertEquals(numero, cpf.getNumero());
        assertDoesNotThrow(() -> new CPF("000.000.000-00"));
    }
}