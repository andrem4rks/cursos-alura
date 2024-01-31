package marks.escola.domain.aluno;

public class Telefone {
    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if(ddd == null || !ddd.matches("([0-9]{3})|([0-9]{2})|(\\s/)")) {
            throw new IllegalArgumentException("DDD inválido!");
        }
        if(numero == null || !numero.matches("([0-9]{8})|([0-9]{9})|(\\s/)")) {
            throw new IllegalArgumentException("Número inválido!");
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
