package br.edu.fatecpg.SistemaTreinamentos.model;

import java.util.ArrayList;

public class Treinamento {
    private int id;
    private String nomeInstrutor;
    private boolean instrutorDisponivel;
    private String linguagemEnsinada;
    private ArrayList<Aluno> alunos;
    private int cargaHoraria;

    public Treinamento(int id, String nomeInstrutor, String linguagemEnsinada, int cargaHoraria) {
        this.id = id;
        this.nomeInstrutor = nomeInstrutor;
        this.instrutorDisponivel = true;
        this.linguagemEnsinada = linguagemEnsinada;
        this.alunos = new ArrayList<>();
        this.cargaHoraria = cargaHoraria;
    }


    public void setCargaHoraria(int cargaHoraria) {
        if ((cargaHoraria >= 4) && (cargaHoraria <= 80)){
            this.cargaHoraria = cargaHoraria;
        } else {
            System.out.println("carga horária inválida!!!");
        }
    }

    public double calcularMedia(){
        if (alunos.isEmpty()) {return 0;}

        double soma = 0;
        for (Aluno a: alunos) {soma += a.getNotaFinal();}

        return soma / alunos.size();
    }

    public void atribuirNota(String nomeAluno,double nota){
        for (Aluno a: alunos){
            if(a.getNome().equalsIgnoreCase(nomeAluno)){
                a.setNotaFinal(nota);
            }
        }
    }

    public int verificarUltimoTreinamento(Aluno aluno){
        return aluno.getHorasUltimos2Meses();
    }

    public void inscreverAluno(Aluno aluno){
        int totalCarga = verificarUltimoTreinamento(aluno) + this.cargaHoraria;
        if (isInstrutorDisponivel()){
            if (totalCarga <= 80){
                alunos.add(aluno);
                int horas = aluno.getHorasUltimos2Meses() + this.cargaHoraria;
                aluno.setHorasUltimos2Meses(horas);
                System.out.println("aluno " + aluno.getNome() + " matriculado com sucesso");
            } else {
                System.out.println("não foi possivel matricular o aluno " + aluno.getNome() + " no Treinamento '" + this.linguagemEnsinada + "'");
                System.out.println("verifique a disponibilidade de horas ou do instrutor");
            }
        }
    }

    public void listaAlunos(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nlista de alunos curso de ").append(this.linguagemEnsinada).append(":\n");
        for (Aluno a: alunos){
            sb.append(a.toString());
            sb.append("-------\n");
        }
        System.out.println(sb);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeInstrutor() {
        return nomeInstrutor;
    }

    public void setNomeInstrutor(String nomeInstrutor) {
        this.nomeInstrutor = nomeInstrutor;
    }

    public String getLinguagemEnsinada() {
        return linguagemEnsinada;
    }

    public void setLinguagemEnsinada(String linguagemEnsinada) {
        this.linguagemEnsinada = linguagemEnsinada;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public boolean isInstrutorDisponivel() {
        return instrutorDisponivel;
    }

    public void setInstrutorDisponivel(boolean instrutorDisponivel) {
        this.instrutorDisponivel = instrutorDisponivel;
    }
}
