package br.edu.fatecpg.SistemaTreinamentos.controller;

import br.edu.fatecpg.SistemaTreinamentos.model.Aluno;
import br.edu.fatecpg.SistemaTreinamentos.model.Treinamento;
import br.edu.fatecpg.SistemaTreinamentos.model.TreinamentoOnline;
import br.edu.fatecpg.SistemaTreinamentos.model.TreinamentoPresencial;

public class TreinamentoController {
    private Treinamento treinamento;

    public TreinamentoController(int id, String nomeInstrutor, String linguagemEnsinada, int cargaHoraria, String local) {
        this.treinamento = new TreinamentoPresencial(id, nomeInstrutor, linguagemEnsinada, cargaHoraria, local);
    }

    public TreinamentoController(int id, String nomeInstrutor, String linguagemEnsinada, int cargaHoraria, String linkAcesso, boolean isOnline) {
        this.treinamento = new TreinamentoOnline(id, nomeInstrutor, linguagemEnsinada, cargaHoraria, linkAcesso);
    }

    public void inscreverAluno(Aluno aluno){
        this.treinamento.inscreverAluno(aluno);
    }

    public double calcularMedia(){
        return this.treinamento.calcularMedia();
    }

    public void atribuirNota(String nomeAluno, double nota){
        this.treinamento.atribuirNota(nomeAluno, nota);
    }

    public void listaAlunos(){
        this.treinamento.listaAlunos();
    }

    public void setCargaHoraria(int cargaHoraria){
        this.treinamento.setCargaHoraria(cargaHoraria);
    }


    public Treinamento getTreinamento() {
        return treinamento;
    }

    public void setTreinamento(Treinamento treinamento) {
        this.treinamento = treinamento;
    }
}
