
package br.uninove.poo;

public class Professor extends Pessoa {
    private int ch;
    private Curso curso;

    public Professor(String nome, String email, int idade, int ch, Curso curso) {
        super(nome, email, idade);
        this.ch = ch;
        this.curso = curso;
    }

    public Professor() {
    }
    
    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
