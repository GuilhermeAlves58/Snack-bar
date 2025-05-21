package pedido;

public interface Observer {
    void atualizar(Pedido pedido);
}

public class Cozinha implements Observer {
    public void atualizar(Pedido pedido) {
        System.out.println("Nova ordem para a cozinha: " + pedido.getDescricao());
    }
}

