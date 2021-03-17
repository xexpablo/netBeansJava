package br.uninove.poo;
                     //é
public class Aluno extends Pessoa {
    private int ra;
    private Curso curso;

    public Aluno(String nome, String email, int idade, int ra, Curso curso) {
        super(nome, email, idade);
        this.ra = ra;
        this.curso = curso;
    }
    
    public Aluno(){
        super();
    }
    
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
