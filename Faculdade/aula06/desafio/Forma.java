package aula06.desafio;

public class Forma {
    protected String cor;
    protected boolean plana;

    public Forma(String cor, boolean plana) {
        this.cor = cor;
        this.plana = plana;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isPlana() {
        return plana;
    }

    public void setPlana(boolean plana) {
        this.plana = plana;
    }

}
