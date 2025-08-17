package br.edu.fatecpg.SistemaPedidos.model;

import br.edu.fatecpg.SistemaPedidos.controller.MesaController;
import br.edu.fatecpg.SistemaPedidos.controller.PedidoController;

import java.util.ArrayList;

public class Restaurante {
    private int pedidoNum;
    private ArrayList<PedidoController> pedidos;
    private ArrayList<MesaController> mesas;

    public Restaurante(int qtdMesas) {
        this.pedidoNum = 1;
        this.pedidos = new ArrayList<>();
        this.mesas = new ArrayList<>();
        for (int i = 0; i < qtdMesas ; i++) {
            MesaController m = new MesaController(i,this);
            mesas.add(m);
        }
    }

    // entrega
    public void addPedido(String endereco, double distancia){
        PedidoController p = new PedidoController(this.pedidoNum,endereco,distancia);
        pedidos.add(p);
        this.pedidoNum ++;
    }

    // mesa
    public void addPedido(int numeroMesa){
        if (!getMesa(numeroMesa).getMesa().isDisponivle()){
            PedidoController p = new PedidoController(this.pedidoNum, numeroMesa);
            getMesa(numeroMesa).getMesa().setPedido(p);
            pedidos.add(p);
            this.pedidoNum ++;
        } else {
            System.out.println("mesa não reservada");
        }
    }

    public void addItemPedido(String nomeDoPrato, int quantidade, double precounitario){
        pedidos.get(getPedidoIdx(pedidoNum-1)).getPedido().addItem(nomeDoPrato, quantidade, precounitario);
    }

    public int getPedidoIdx(int numero){
        for (PedidoController p:pedidos){
            if (p.getPedido().getNumero() == numero){
                return pedidos.indexOf(p);
            }
        }
        return -1;
    }

    public void removerPedido(int num){
        for (PedidoController p: pedidos){
            if (num == p.getPedido().getNumero()){
                if(p.getPedido() instanceof PedidoMesa){
                    if (p.getPedido().equals(findMesaByPedido(p).getPedido().getPedido())) {
                        findMesaByPedido(p).liberarMesa();
                    }
                }
                pedidos.remove(p);
                break;
            }
        }
    }

    public void reservarMesa(int num){
        getMesa(num).reservarMesa();
    }

    public void liberarMesa(int num){
        getMesa(num).liberarMesa();
    }

    public void listaPedidos() {
        StringBuilder sb = new StringBuilder();

        for (PedidoController p: pedidos){
            p.infoPedido();
        }
    }

    public MesaController findMesaByPedido(PedidoController pedido){
        return mesas.get(((PedidoMesa) pedido.getPedido()).getNumeroMesa());
    }

    public int findPedidoMesa(int idx){
        return mesas.get(idx).getPedido().getPedido().getNumero();
    }

    public MesaController getMesa(int idx){
        return mesas.get(idx);
    }

    public int getPedidoNum() {
        return pedidoNum;
    }

    public void setPedidoNum(int pedidoNum) {
        this.pedidoNum = pedidoNum;
    }

    public ArrayList<PedidoController> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<PedidoController> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<MesaController> getMesas() {
        return mesas;
    }

    public void setMesas(ArrayList<MesaController> mesas) {
        this.mesas = mesas;
    }
}
