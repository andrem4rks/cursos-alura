package marks.escola.domain.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private CPF cpf;
    private String nome;
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero) {
        this.telefones.add(new Telefone(ddd, numero));
    }

    public String getCpf() {
        return this.cpf.getNumero();
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email.getEndereco();
    }

    public List<Telefone> getTelefones() {
        return this.telefones;
    }
}
