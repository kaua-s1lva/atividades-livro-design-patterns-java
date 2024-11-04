import java.time.LocalDateTime;

public class HistoricoPedido {
    private String nomeDoEstado;
    private LocalDateTime dataHoraDaMudanca;

    public HistoricoPedido (String nomeDoEstado, LocalDateTime dataHoraDaMudanca) {
        this.nomeDoEstado = nomeDoEstado;
        this.dataHoraDaMudanca = dataHoraDaMudanca;
    }

    public String getNomeDoEstado() {
        return nomeDoEstado;
    }

    public LocalDateTime getDataHoraDaMudanca() {
        return dataHoraDaMudanca;
    }
}
