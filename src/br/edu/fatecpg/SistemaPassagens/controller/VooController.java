package br.edu.fatecpg.SistemaPassagens.controller;

import br.edu.fatecpg.SistemaPassagens.model.Voo;

public class VooController {
    private Voo voo;

    public VooController(String numeroVoo, String origem, String destino, int assentosDisponiveis, double valorAssento, boolean idaVolta, boolean pontoTuristico) {
        this.voo = new Voo(numeroVoo,origem,destino,assentosDisponiveis,valorAssento,idaVolta,pontoTuristico);
    }

    public boolean isQtdAssentosDisponiveis(int qtd){
        if(qtd <= this.voo.getAssentosDisponiveis()){
            return true;
        }
        return false;
    }

    public void realizarRezerva(int qtd){
        if(isQtdAssentosDisponiveis(qtd)){
            this.voo.setAssentosDisponiveis(this.voo.getAssentosDisponiveis()-qtd);
        }
    }

    public void infoVoo(){
        Voo v = this.getVoo();
        StringBuilder sb = new StringBuilder();

        sb.append("voo n°: ").append(v.getNumeroVoo()).append("\n");
        sb.append("origem: ").append(v.getOrigem()).append("\n");
        sb.append("destino: ").append(v.getDestino()).append("\n");
        sb.append("assentos disponiveis: ").append(v.getAssentosDisponiveis()).append("\n");
        sb.append("valor assento: ").append(v.getValorAssento()).append("\n");
        if (v.isIdaVolta()){
            sb.append("ida e volta").append("\n");
        }
        if (v.isPontoTuristico()){
            sb.append("ponto turistico").append("\n");
        }
        System.out.println(sb);
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }
}
