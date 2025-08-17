package br.edu.fatecpg.SistemaPedidos.model;

import br.edu.fatecpg.SistemaPedidos.controller.PedidoController;

public class Mesa {
    private Restaurante restaurante;
    private int numero;
    private boolean disponivle;
    private PedidoController pedido;

    public Mesa(int numero, Restaurante restaurante) {
        this.restaurante = restaurante;
        this.numero = numero;
        this.disponivle = true;
        this.pedido = new PedidoController(this.restaurante.getPedidoNum(), this.numero);
    }

    public void reservarMesa(){
        if (this.disponivle){
            this.disponivle =false;
        } else {
            System.out.println("mesa indisponivel!!!");
        }
    }

    public void liberarMesa(){
        if (!this.disponivle){
            this.pedido = new PedidoController(this.restaurante.getPedidoNum(), this.numero);
            this.disponivle = true;
        } else {
            System.out.println("mesa já disponivel!!!");
        }
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isDisponivle() {
        return disponivle;
    }

    public void setDisponivle(boolean disponivle) {
        this.disponivle = disponivle;
    }

    public PedidoController getPedido() {
        return pedido;
    }

    public void setPedido(PedidoController pedido) {
        this.pedido = pedido;
    }
}
