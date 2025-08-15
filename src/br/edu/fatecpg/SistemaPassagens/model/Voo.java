package br.edu.fatecpg.SistemaPassagens.model;

public class Voo {
    private String numeroVoo;
    private String origem;
    private String destino;
    private int assentosDisponiveis;
    private double valorAssento;
    private boolean idaVolta;
    private boolean pontoTuristico;

    public Voo(String numeroVoo, String origem, String destino, int assentosDisponiveis, double valorAssento, boolean idaVolta, boolean pontoTuristico) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.assentosDisponiveis = assentosDisponiveis;
        this.valorAssento = valorAssento;
        this.idaVolta = idaVolta;
        this.pontoTuristico = pontoTuristico;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getAssentosDisponiveis() {
        return assentosDisponiveis;
    }

    public void setAssentosDisponiveis(int assentosDisponiveis) {
        this.assentosDisponiveis = assentosDisponiveis;
    }

    public double getValorAssento() {
        return valorAssento;
    }

    public void setValorAssento(double valorAssento) {
        this.valorAssento = valorAssento;
    }

    public boolean isIdaVolta() {
        return idaVolta;
    }

    public void setIdaVolta(boolean idaVolta) {
        this.idaVolta = idaVolta;
    }

    public boolean isPontoTuristico() {
        return pontoTuristico;
    }

    public void setPontoTuristico(boolean pontoTuristico) {
        this.pontoTuristico = pontoTuristico;
    }
}
