package br.edu.fatecpg.SistemaPedidos.model;

import java.util.ArrayList;

public class PedidoMesa extends Pedido{
    private int numeroMesa;

    public PedidoMesa(int numero, ArrayList<ItemPedido> itens, int numeroMesa) {
        super(numero, itens);
        this.numeroMesa = numeroMesa;
    }

    public String infoPedido(){
        StringBuilder sb = new StringBuilder();
        sb.append("pedido n°: ").append(super.getNumero()).append("\n");
        sb.append("mesa: ").append(numeroMesa).append("\n");
        sb.append(super.infoPedido());
        return sb.toString();
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
}
