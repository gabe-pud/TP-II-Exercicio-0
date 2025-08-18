package br.edu.fatecpg.SistemaTreinamentos.controller;

import br.edu.fatecpg.SistemaTreinamentos.model.Aluno;

public class AlunoController {
    Aluno aluno;

    public AlunoController(String nome, int horasUltimos2Meses) {
        this.aluno = new Aluno(nome,horasUltimos2Meses);
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
