package br.edu.fatecpg.SistemaTreinamentos.model;

public class TreinamentoPresencial extends Treinamento{
    private String local;

    public TreinamentoPresencial(int id, String nomeInstrutor, String linguaEnsinada, int cargaHoraria, String local) {
        super(id, nomeInstrutor, linguaEnsinada, cargaHoraria);
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
