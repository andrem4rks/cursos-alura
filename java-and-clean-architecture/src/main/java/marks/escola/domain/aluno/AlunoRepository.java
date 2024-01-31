package marks.escola.domain.aluno;

import java.sql.SQLException;
import java.util.List;

public interface AlunoRepository {

    void matricular(Aluno aluno) throws SQLException;

    Aluno buscarPorCPF(CPF cpf);

    List<Aluno> listarTodosAlunosMatriculados();
}
