package br.edu.fatecpg.SistemaPassagens.controller;

import br.edu.fatecpg.SistemaPassagens.model.Aeroporto;

public class AeroportoController {
    private Aeroporto aeroporto;

    public AeroportoController(){
        this.aeroporto = new Aeroporto();
    }

    public void criarPassagem(VooController vooController, int qtdAssentos){
        PassagemController p = new PassagemController(vooController,qtdAssentos);
        aeroporto.getPassagens().add(p);
    }

    public void addVoo(String numeroVoo, String origem, String destino, int assentosDisponiveis, double valorAssento, boolean idaVolta, boolean pontoTuristico){
        aeroporto.getVoos().add(new VooController(numeroVoo,origem,destino,assentosDisponiveis,valorAssento,idaVolta,pontoTuristico));
    }

    public void removeVoo(int idx){
        aeroporto.getVoos().remove(idx);
    }

    public VooController buscarVoo(int idx) {
        return aeroporto.getVoos().get(idx);
    }

    public void exibirVoos(){
        for (VooController v: aeroporto.getVoos()){
            v.infoVoo();
        }
    }

    public PassagemController buscarPassagem(int idx){
        return aeroporto.getPassagens().get(idx);
    }

    public void exibirPassagens(){
        for (PassagemController p: aeroporto.getPassagens()){
            p.imprimirPassagem();
        }
    }

    public Aeroporto getAeroporto() {
        return aeroporto;
    }

    public void setAeroporto(Aeroporto aeroporto) {
        this.aeroporto = aeroporto;
    }
}
