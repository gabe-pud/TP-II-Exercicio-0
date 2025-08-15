package br.edu.fatecpg.SistemaPassagens.model;

import br.edu.fatecpg.SistemaPassagens.controller.PassagemController;
import br.edu.fatecpg.SistemaPassagens.controller.VooController;

import java.util.ArrayList;

public class Aeroporto {
    private ArrayList<VooController> voos;
    private ArrayList<PassagemController> passagens;

    public Aeroporto() {
        this.voos = new ArrayList<>();
        this.passagens = new ArrayList<>();
    }

    public ArrayList<VooController> getVoos() {
        return voos;
    }

    public void setVoos(ArrayList<VooController> voos) {
        this.voos = voos;
    }

    public ArrayList<PassagemController> getPassagens() {
        return passagens;
    }

    public void setPassagens(ArrayList<PassagemController> passagens) {
        this.passagens = passagens;
    }
}
