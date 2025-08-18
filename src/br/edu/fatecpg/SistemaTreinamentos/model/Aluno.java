package br.edu.fatecpg.SistemaTreinamentos.model;

public class Aluno {
    private String nome;
    private int horasUltimos2Meses;
    private double notaFinal;

    public Aluno(String nome, int horasUltimos2Meses) {
        this.nome = nome;
        this.horasUltimos2Meses = horasUltimos2Meses;
        this.notaFinal = 0;
    }

    public String toString(){
        return "nome: " + this.nome +
                "\nnota fnal:" + this.notaFinal + "\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasUltimos2Meses() {
        return horasUltimos2Meses;
    }

    public void setHorasUltimos2Meses(int horasUltimos2Meses) {
        this.horasUltimos2Meses = horasUltimos2Meses;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
}
