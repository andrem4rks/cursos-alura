package marks.escola;

import marks.escola.domain.aluno.Aluno;
import marks.escola.domain.aluno.FabricaDeAluno;

public class Main {
    public static void main(String[] args) {
        //para exemplo
        FabricaDeAluno fabrica = new FabricaDeAluno();
        Aluno aluno = fabrica
                .comNomeCpfEmail("Vandersson", "000.000.000-00", "email@email.com")
                .comTelefone("00", "00000000")
                .criar();
        System.out.println(aluno);
    }
}