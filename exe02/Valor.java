public class Valor {
    private double nota;
    private int quantidade;

    public Valor(double nota, int quantidade) {
        this.nota = nota;
        this.quantidade = quantidade;
    }

    public double getNota () {
        return nota;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
