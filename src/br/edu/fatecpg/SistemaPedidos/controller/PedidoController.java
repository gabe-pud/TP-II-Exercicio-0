package br.edu.fatecpg.SistemaPedidos.controller;

import br.edu.fatecpg.SistemaPedidos.model.ItemPedido;
import br.edu.fatecpg.SistemaPedidos.model.Pedido;
import br.edu.fatecpg.SistemaPedidos.model.PedidoEntrega;
import br.edu.fatecpg.SistemaPedidos.model.PedidoMesa;

import java.util.ArrayList;

public class PedidoController {
    private Pedido pedido;

    public PedidoController(int numero, int numeroMesa) {
        ArrayList<ItemPedido> itens = new ArrayList<>();
        this.pedido = new PedidoMesa(numero, itens, numeroMesa);
    }

    public PedidoController(int numero, String endereco, double distancia){
        ArrayList<ItemPedido> itens = new ArrayList<>();
        this.pedido = new PedidoEntrega(numero, itens, endereco, distancia);
    }

    public void infoPedido(){
        System.out.println(this.pedido.infoPedido());
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
