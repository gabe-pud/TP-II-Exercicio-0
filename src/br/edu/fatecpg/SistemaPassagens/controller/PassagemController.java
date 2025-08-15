package br.edu.fatecpg.SistemaPassagens.controller;

import br.edu.fatecpg.SistemaPassagens.model.Passagem;
import br.edu.fatecpg.SistemaPassagens.model.Voo;

public class PassagemController {
    private Passagem passagem;
    private VooController vooController;

    public PassagemController(VooController vooController, int qtdAssentos) {
        this.vooController = vooController;
        this.passagem = new Passagem(vooController, qtdAssentos, calcularValorPassagem(qtdAssentos));
    }

    public double calcularValorPassagem(int qtdAssentos){
        double total = getVoo().getValorAssento() * qtdAssentos;
        if(getVoo().isPontoTuristico()){
            total *= 1.1;
        }
        if(getVoo().isIdaVolta()){
            total *= 2;
        }
        return total;
    }

    public void realizarPagamento(){
        passagem.getVooController().realizarRezerva(passagem.getQtdAssentos());
        passagem.setPago(true);
        imprimirPassagem();
    }

    public void imprimirPassagem(){
        Voo v = this.getVoo();
        Passagem p = this.passagem;
        StringBuilder sb = new StringBuilder();

        sb.append("voo n°: ").append(v.getNumeroVoo()).append("\n");
        sb.append("origem: ").append(v.getOrigem()).append("\n");
        sb.append("destino: ").append(v.getDestino()).append("\n");
        if(p.isPago()){
            sb.append("assentos reservados: ").append(p.getQtdAssentos()).append("\n");
        } else {
            sb.append("assentos a reservar: ").append(p.getQtdAssentos()).append("\n");
        }
        if (v.isIdaVolta()){
            sb.append("ida e volta").append("\n");
        }
        if (v.isPontoTuristico()){
            sb.append("ponto turistico").append("\n");
        }
        sb.append("valor passagem: ").append(p.getValorPassagem()).append("\n");
        if(p.isPago()){
            sb.append("status: PAGO");
        } else {
            sb.append("status: NÃO PAGO");
        }
        System.out.println(sb);
    }

    public Voo getVoo(){
        return  vooController.getVoo();
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    public VooController getVooController() {
        return vooController;
    }

    public void setVooController(VooController vooController) {
        this.vooController = vooController;
    }
}
