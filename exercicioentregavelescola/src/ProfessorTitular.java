public class ProfessorTitular extends Professor {

    private String especialidade;

    public ProfessorTitular(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor, String especialidade) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor);
        this.especialidade = especialidade;
    }
}

