package Ex03;

public class Disciplina {

    private int id;
    private String nome;
    private String descricao;
    private Professor professor;
    private Sala sala;
    private Turno turno;

    public Disciplina(String nome, String descricao, Professor professor, Sala sala, Turno turno) {
        this.nome = nome;
        this.descricao = descricao;
        this.professor = professor;
        this.sala = sala;
        this.turno = turno;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        String txt = "";

        txt += "Disciplina: " + this.nome + "\n"
                + this.descricao + "\n"
                + this.professor + "\n"
                + this.sala + "\n"
                + "Turno: " + this.turno.getValue() + "\n";

        return txt;
    }

}
