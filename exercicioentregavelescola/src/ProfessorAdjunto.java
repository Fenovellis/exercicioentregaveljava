public class ProfessorAdjunto extends Professor {

    private Integer horasMonitoria;

    public ProfessorAdjunto(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor, Integer horasMonitoria) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor);
        this.horasMonitoria = horasMonitoria;
    }

}

