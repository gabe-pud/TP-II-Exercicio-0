package br.edu.fatecpg.SistemaPedidos.controller;

import br.edu.fatecpg.SistemaPedidos.model.Restaurante;

public class RestauranteController {
    private Restaurante restaurante;

    public RestauranteController(int qtdMesas) {
        this.restaurante = new Restaurante(qtdMesas);
    }

    public void addPedido(String endereco, double distancia){
        this.restaurante.addPedido(endereco, distancia);
    }

    public void addPedido(int numeroMesa){
        this.restaurante.addPedido(numeroMesa);
    }

    public void addItemPedido(String nomeDoPrato, int quantidade, double precounitario){
        this.restaurante.addItemPedido(nomeDoPrato, quantidade, precounitario);
    }

    public void removerPedido(int num) {
        this.restaurante.removerPedido(num);
    }

    public void reservarMesa(int num){
        this.restaurante.reservarMesa(num);
    }

    public void liberarMesa(int num){
        this.restaurante.liberarMesa(num);
    }

    public void listaPedidos(){
        this.restaurante.listaPedidos();
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }


}
