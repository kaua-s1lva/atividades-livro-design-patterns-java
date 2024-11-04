public class EstadoEntregue extends EstadoPedido {
    
    public EstadoEntregue(Pedido pedido) {
        super(pedido);
        System.out.println("Pedido Entregue");
    }

    @Override
    public void preparar() {
        throw new RuntimeException("Pedido já foi entregue");
    }

    @Override
    public void finalizarPreparo() {
        throw new RuntimeException("Pedido já foi entregue");
    }

    @Override
    public void entregar() {
        throw new RuntimeException("Pedido já foi entregue");
    }
}
