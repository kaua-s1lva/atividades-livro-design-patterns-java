public class Principal {
    public static void main (String[] args) {
        Pedido pedido = new Pedido();

        try {
            pedido.preparar();
            pedido.finalizarPreparo();
            pedido.entregar();
        } catch (RuntimeException e) {
            System.out.println("Falha: " + e.getMessage());
        }
    }
}
