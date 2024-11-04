public class EstadoAberto extends EstadoPedido {
    
    public EstadoAberto(Pedido pedido) {
        super(pedido);
        System.out.println("Pedido Aberto");
    }

    @Override
    public void preparar() {
        pedido.setEstado(new EstadoEmPreparo(pedido));
    }

    @Override
    public void finalizarPreparo() {
        throw new RuntimeException("Pedido ainda não está em preparo");
    }

    @Override
    public void entregar() {
        throw new RuntimeException("Pedido ainda não está pronto");
    }
}
