import java.util.Date;
import java.util.List;

public class DigitalHouseManager {
public List <Aluno> alunoList;
public List <Professor> professorList;
public List <Curso> cursoList;
public List <Matricula> matriculaList;

    public void registrarCurso (String nome, Integer codigoCurso,Integer maximoDeAlunos ){
        Curso curso = new Curso(nome,codigoCurso,null,null,maximoDeAlunos,null);
        cursoList.add (curso);
    }
    public void excluirCurso (Integer codigoCurso){
        Curso curso = new Curso();
        if (codigoCurso.equals(curso.getCodigoCurso())){
            cursoList.remove(curso);
        }
        else{
            System.out.println("curso não cadastrado");
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome,
                                          Integer codigoProfessor, Integer quantidadeDeHoras) {
        Professor professorAdj = new ProfessorAdjunto(nome,sobrenome,0,codigoProfessor,quantidadeDeHoras);
        professorList.add(professorAdj);

    }
    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){
        Professor professorTit = new ProfessorTitular(nome,sobrenome,0,codigoProfessor,especialidade);
        professorList.add(professorTit);
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){
        Date date = new Date();
        for (Curso curso : cursoList){
            for (Aluno aluno :alunoList){
                if (curso.getCodigoCurso().equals(codigoCurso)&& aluno.getCodigoAluno().equals(codigoAluno)){
                    Matricula matricula = new Matricula(aluno,curso,date);
                    matriculaList.add(matricula);
                    System.out.println("Matricula realizada");
            }else {
                    System.out.println("Não foi possível matricular o aluno, não há vaga!");
                }



            }
        }





    }


}
