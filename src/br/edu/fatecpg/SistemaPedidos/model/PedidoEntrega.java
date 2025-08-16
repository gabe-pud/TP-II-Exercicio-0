package br.edu.fatecpg.SistemaPedidos.model;

import java.util.ArrayList;

public class PedidoEntrega extends Pedido{
    private String endereco;
    private double distancia; // Km

    public PedidoEntrega(int numero, ArrayList<ItemPedido> itens, String endereco, double distancia) {
        super(numero, itens);
        this.endereco = endereco;
        this.distancia = distancia;
    }

    public double calcularTotalPedido(){
        double t = super.calcularTotalPedido();
        t += 5 + this.distancia;
        return t;
    }

    public String infoPedido(){
        StringBuilder sb = new StringBuilder();
        sb.append("pedido n°: ").append(super.getNumero()).append("\n");
        sb.append("endereco: ").append(endereco).append("\n");
        sb.append(super.infoPedido());
        return sb.toString();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}
