public class EstadoEmPreparo extends EstadoPedido {
    
    public EstadoEmPreparo(Pedido pedido) {
        super(pedido);
        System.out.println("Pedido em Preparo");
    }

    @Override
    public void preparar() {
        throw new RuntimeException("Pedido já está em preparo");
    }

    @Override
    public void finalizarPreparo() {
        pedido.setEstado(new EstadoPronto(pedido));
    }

    @Override
    public void entregar() {
        throw new RuntimeException("Pedido ainda não está pronto");
    }

}
