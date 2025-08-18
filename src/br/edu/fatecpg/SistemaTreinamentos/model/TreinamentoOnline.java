package br.edu.fatecpg.SistemaTreinamentos.model;

public class TreinamentoOnline extends Treinamento{
    private String linkAcesso;

    public TreinamentoOnline(int id, String nomeInstrutor, String linguagemEnsinada, int cargaHoraria, String linkAcesso) {
        super(id, nomeInstrutor, linguagemEnsinada, cargaHoraria);
        this.linkAcesso = linkAcesso;
    }

    public String getLinkAcesso() {
        return linkAcesso;
    }

    public void setLinkAcesso(String linkAcesso) {
        this.linkAcesso = linkAcesso;
    }
}
