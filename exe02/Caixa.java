import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Caixa {
    private String tipoMoeda;
    private ArrayList<Valor> valores;

    public Caixa (String tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
        valores = new ArrayList<Valor>();
    }

    public void adicionarValor(double nota, int quantidade) {
        valores.add(new Valor(nota, quantidade));
        Collections.sort(valores, new Comparator<Valor>() {
            @Override
            public int compare (Valor a, Valor b) {
                return Double.compare(b.getNota(), a.getNota());
            }
        });
    }

    public void sacar(double valor) {
        for (int i=0; i<valores.size(); i++) {
            if (valor >= valores.get(i).getNota() && valores.get(i).getQuantidade() >= 1) {
                valor -= valores.get(i).getNota();
                valores.get(i).setQuantidade(valores.get(i).getQuantidade() - 1);

                System.out.println("Você sacou: " + valores.get(i).getNota());
            }
        }
        if (valor > 0) {
            System.out.println("Restam ainda " + tipoMoeda + valor + " para ser sacado, devido a falta de notas disponiveis");
        }

    }

    public void imprimiCaixa() {
        System.out.println("\nMoeda do caixa: " + tipoMoeda + "\n");
        System.out.println("   nota   |   quantidade");
        for (Valor valor : valores) {
            System.out.println("  " + valor.getNota() + "          " + valor.getQuantidade());
        }
    }

    public static void main (String[] args) {
        Caixa caixa = new Caixa("R$");

        caixa.adicionarValor(50, 3);
        caixa.adicionarValor(100, 1);

        caixa.imprimiCaixa();

        caixa.sacar(150);

        caixa.imprimiCaixa();

    }
}