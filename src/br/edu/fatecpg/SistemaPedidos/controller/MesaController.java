package br.edu.fatecpg.SistemaPedidos.controller;

import br.edu.fatecpg.SistemaPedidos.model.Mesa;
import br.edu.fatecpg.SistemaPedidos.model.Restaurante;

public class MesaController {
    private Mesa mesa;

    public MesaController(int numero, Restaurante restaurante) {
        this.mesa = new Mesa(numero,restaurante);
    }

    public void reservarMesa() {
        this.mesa.reservarMesa();
    }

    public void liberarMesa() {
        this.mesa.liberarMesa();
    }

    public PedidoController getPedido(){
        return this.mesa.getPedido();
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
}
