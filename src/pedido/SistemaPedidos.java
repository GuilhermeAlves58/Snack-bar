package pedido;

public class SistemaPedidos {
    private static SistemaPedidos instancia;
    private List<Pedido> pedidos = new ArrayList<>();

    private SistemaPedidos() {}

    public static SistemaPedidos getInstancia() {
        if (instancia == null) {
            instancia = new SistemaPedidos();
        }
        return instancia;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido adicionado.");
    }
}


