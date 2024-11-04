import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String estado;
    private List<HistoricoPedido> historico;

    public Pedido() {
        this.estado = "Aberto";
        this.historico = new ArrayList<>();
        registrarHistorico("Aberto");
    }

    public void preparar() {
        if ("Aberto".equals(this.estado)) {
            this.estado = "Em Preparo";
            registrarHistorico("Em Preparo");
        } else {
            throw new RuntimeException("Pedido não pode ser preparado no estado atual: " + this.estado);
        }
    }

    public void finalizarPreparo() {
        if ("Em Preparo".equals(this.estado)) {
            this.estado = "Pronto";
            registrarHistorico("Pronto");
        } else {
            throw new RuntimeException("Pedido não pode ser finalizado no estado atual: " + this.estado);
        }
    }

    public void entregar() {
        if ("Pronto".equals(this.estado)) {
            this.estado = "Entregue";
            registrarHistorico("Entregue");
        } else {
            throw new RuntimeException("Pedido não pode ser entregue no estado atual: " + this.estado);
        }
    }

    private void registrarHistorico(String estado) {
        this.historico.add(new HistoricoPedido(estado, LocalDateTime.now()));
    }

    public String getEstado() {
        return estado;
    }

    public List<HistoricoPedido> getHistorico() {
        return historico;
    }

    public static void main (String[] args) {
        Pedido pedido = new Pedido();

        System.out.println(pedido.getEstado());

        pedido.preparar();

        System.out.println(pedido.getEstado());

        pedido.finalizarPreparo();

        System.out.println(pedido.getEstado());

        for (HistoricoPedido h : pedido.getHistorico())
        System.out.println(h.getDataHoraDaMudanca());
    }
}