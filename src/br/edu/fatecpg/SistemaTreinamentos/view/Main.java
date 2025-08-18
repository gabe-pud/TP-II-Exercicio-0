package br.edu.fatecpg.SistemaTreinamentos.view;

import br.edu.fatecpg.SistemaTreinamentos.controller.AlunoController;
import br.edu.fatecpg.SistemaTreinamentos.controller.TreinamentoController;


public class Main {
    public static void main(String[] args) {
        AlunoController gabriel = new AlunoController("gabriel",10);
        AlunoController thiago = new AlunoController("thiago",0);
        AlunoController levi = new AlunoController("levi",0);

        TreinamentoController java = new TreinamentoController(1,"alessandro","java",80, "Fatec-pg");
        TreinamentoController python = new TreinamentoController(2,"eulaliane","python",60,"https://cursoPython.com",true);

        java.inscreverAluno(thiago.getAluno());
        java.inscreverAluno(levi.getAluno());

        java.atribuirNota("thiago",9.5);
        java.atribuirNota("levi", 8.0);

        python.inscreverAluno(gabriel.getAluno());
        python.atribuirNota("gabriel",9);

        python.inscreverAluno(thiago.getAluno());

        java.listaAlunos();
        python.listaAlunos();

        System.out.println("media java:" + java.calcularMedia());
        System.out.println("media pthon:" + python.calcularMedia());
    }
}