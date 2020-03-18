public class Curso {
    private String nome;
    private Integer codigoCurso;

    public Curso(String nome, Integer codigoCurso) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
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
}
