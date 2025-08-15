package br.edu.fatecpg.SistemaPassagens.model;

import br.edu.fatecpg.SistemaPassagens.controller.VooController;

public class Passagem {
    private VooController vooController;
    private double valorPassagem;
    private int qtdAssentos;
    private boolean pago;

    public Passagem(VooController vooController, int qtdAssentos, double valorPassagem) {
        this.vooController = vooController;
        this.qtdAssentos = qtdAssentos;
        this.pago = false;
        this.valorPassagem = valorPassagem;
    }

    public VooController getVooController() {
        return vooController;
    }

    public void setVooController(VooController vooController) {
        this.vooController = vooController;
    }

    public int getQtdAssentos() {
        return qtdAssentos;
    }

    public double getValorPassagem() {
        return valorPassagem;
    }

    public void setValorPassagem(double valorPassagem) {
        this.valorPassagem = valorPassagem;
    }

    public void setQtdAssentos(int qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}
