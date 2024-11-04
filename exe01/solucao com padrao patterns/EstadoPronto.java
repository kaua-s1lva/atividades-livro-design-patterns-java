public class EstadoPronto extends EstadoPedido {
    
    public EstadoPronto(Pedido pedido) {
        super(pedido);
        System.out.println("Pedido Pronto");
    }

    @Override
    public void preparar() {
        throw new RuntimeException("Pedido já está pronto");
    }

    @Override
    public void finalizarPreparo() {
        throw new RuntimeException("Pedido já está pronto");
    }

    @Override
    public void entregar() {
        pedido.setEstado(new EstadoEntregue(pedido));
    }
}
