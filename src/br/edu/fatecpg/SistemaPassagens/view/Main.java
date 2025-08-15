package br.edu.fatecpg.SistemaPassagens.view;


import br.edu.fatecpg.SistemaPassagens.controller.*;

public class Main {
    public static void main(String[] args) {
        AeroportoController aeroporto = new AeroportoController();

        aeroporto.addVoo("123","SP","CE",25,250,true,false);
        aeroporto.addVoo("456","US","CA",40,875,false,true);

        aeroporto.exibirVoos();

        System.out.println("criando passagem:\n");
        aeroporto.criarPassagem(aeroporto.buscarVoo(1),2);
        aeroporto.exibirPassagens();

        System.out.println("quantidade de assentos disponiveis antes do pagamento:\n");
        aeroporto.buscarVoo(1).infoVoo();

        System.out.println("-------");
        aeroporto.buscarPassagem(0).realizarPagamento();

        System.out.println("quantidade de assentos disponiveis depois do pagamento:\n");
        aeroporto.buscarVoo(1).infoVoo();
    }
}