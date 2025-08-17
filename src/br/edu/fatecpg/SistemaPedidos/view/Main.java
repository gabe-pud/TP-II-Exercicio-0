package br.edu.fatecpg.SistemaPedidos.view;

import br.edu.fatecpg.SistemaPedidos.controller.RestauranteController;

public class Main {
    public static void main(String[] args) {
        RestauranteController restaurante = new RestauranteController(10);

        // pedido em mesa
        restaurante.reservarMesa(5);
        restaurante.addPedido(5);
        restaurante.addItemPedido("frango", 1,8.75);
        restaurante.addItemPedido("hamburger", 1,15.90);
        restaurante.liberarMesa(5);

        // pedido para entrega
        restaurante.addPedido("rua 1",2);
        restaurante.addItemPedido("hamburger", 1,15.90);

        // removendo pedido
        restaurante.removerPedido(1);

        // novo pedido para a mesma mesa
        restaurante.reservarMesa(5);
        restaurante.addPedido(5);
        restaurante.addItemPedido("hamburger", 2,15.90);
        restaurante.liberarMesa(5);

        // exibir todos os pedidos
        restaurante.listaPedidos();
    }
}