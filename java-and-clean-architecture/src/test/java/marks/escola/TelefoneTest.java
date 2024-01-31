package marks.escola;

import marks.escola.domain.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefonesComDDDsOuNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("", ""));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("000a", "999b"));
    }

    @Test
    void DeveCriarTelefoneComNumeroEDDDValido() {
        String ddd = "00";
        String numero = "00000000";
        Telefone telefone = new Telefone(ddd, numero);

        assertEquals(ddd, telefone.getDdd());
        assertEquals(numero, telefone.getNumero());
        assertDoesNotThrow(() -> new Telefone("00", "00000000"));
        assertDoesNotThrow(() -> new Telefone("000", "000000000"));
    }
}