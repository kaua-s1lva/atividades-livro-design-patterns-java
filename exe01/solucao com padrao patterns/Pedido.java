public class Pedido {
    private EstadoPedido estado;

    public Pedido() {
        this.estado = new EstadoAberto(this);
    }

    public void preparar() {
        estado.preparar();
    }

    public void finalizarPreparo() {
        estado.finalizarPreparo();
    }

    public void entregar() {
        estado.entregar();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }
}
