package br.edu.fatecpg.SistemaPedidos.model;

import java.util.ArrayList;

public class Pedido {
    private int numero;
    private ArrayList<ItemPedido> itens;
    private double total;

    public Pedido(int numero, ArrayList<ItemPedido> itens) {
        this.numero = numero;
        this.itens = itens;
        this.total = 0;
    }

    public double calcularTotalPedido(){
        double t = 0;
        for (ItemPedido i: itens){
            t += i.getPrecoUnitario() * i.getQuantidade();
        }
        return t;
    }

    public String infoPedido(){
        StringBuilder sb = new StringBuilder();
        sb.append("      item      | qtd | preco un.\n");
        for (ItemPedido i: itens){

            sb.append(String.format("%-15s",i.getNomeDoPrato())).append(" | ");
            sb.append(" ").append(i.getQuantidade()).append("  | ");
            sb.append("R$").append(String.format("%.2f",i.getPrecoUnitario())).append("\n");
        }
        sb.append("total: R$").append(String.format("%.2f",total)).append("\n\n");
        return sb.toString();
    }

    public void addItem(String nomeDoPrato,int quantidade,double precoUnitario){
        ItemPedido i = new ItemPedido(nomeDoPrato,quantidade,precoUnitario);
        this.itens.add(i);
        setTotal(calcularTotalPedido());
    }

    public void removeItem(int idx){
        this.itens.remove(idx);
        setTotal(calcularTotalPedido());
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemPedido> itens) {
        this.itens = itens;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
