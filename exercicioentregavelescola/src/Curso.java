import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private Integer codigoCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer maximoDeAluno;
    private List<Aluno> listaDeAluno;

    public Curso(String nome, Integer codigoCurso, ProfessorTitular professorTitular,
                 ProfessorAdjunto professorAdjunto, Integer maximoDeAluno, List<Aluno> listaDeAluno) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.maximoDeAluno = maximoDeAluno;
        this.listaDeAluno = listaDeAluno;
    }

    public Curso() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getMaximoDeAluno() {
        return maximoDeAluno;
    }

    public void setMaximoDeAluno(Integer maximoDeAluno) {
        this.maximoDeAluno = maximoDeAluno;
    }

    public List<Aluno> getListaDeAluno() {
        return listaDeAluno;
    }

    public void setListaDeAluno(List<Aluno> listaDeAluno) {
        this.listaDeAluno = listaDeAluno;
    }

    public Boolean addUmAluno(Aluno umAluno) {

        for (Aluno aluno : listaDeAluno) {
            if (umAluno != aluno) {
                if (listaDeAluno.size() < maximoDeAluno) {
                    listaDeAluno.add(umAluno);
                    System.out.println("Aluno matriculado com sucesso!");
                } else {
                    System.out.println("Vaga indispinível!");
                    return false;
                }

            } else {
                System.out.println("Aluno já está matriculado!");
                return false;
            }
        }

        return true;
    }

    public void excluirAluno(Aluno umAluno) {

        for (Aluno aluno : listaDeAluno) {
            if (umAluno == aluno) {
                listaDeAluno.remove(umAluno);
                System.out.println("Aluno excluído");
            } else {
                System.out.println("Aluno não matriculado");
            }
        }
    }
}




