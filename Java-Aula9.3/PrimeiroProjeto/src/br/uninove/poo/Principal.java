package br.uninove.poo;

public class Principal {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        
        Curso curso = new Curso();
        curso.setNomeCurso("Fotografia");
        curso.setCargaHoraria(2000);
        
        Aluno a1 = new Aluno("Josefino", "josefino@uni9.edu.br", 18, 1234, new Curso("ADM", 5000));
    }
}
