package marks.escola.infra.exceptions;

import marks.escola.domain.aluno.CPF;

public class AlunoNaoEncontradoException extends RuntimeException {

    public AlunoNaoEncontradoException(CPF cpf) {
        super("Aluno não encontrado com CPF: " + cpf.getNumero());
    }
}
