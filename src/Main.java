import Lanche.Lanche;
import Lanche.QueijoExtra;
import lancheFactory.ConcreteLancheFactory;
import lancheFactory.LancheFactory;
import pedido.Pedido;
import pedido.SistemaPedidos;

public class Main {
    public static void main(String[] args) {
        LancheFactory factory = new ConcreteLancheFactory();
        Lanche lanche = factory.criarLanche("xburger");
        lanche = new QueijoExtra(lanche);
        lanche = new Bacon(lanche);

        Pedido pedido = new Pedido(lanche, new CartaoCredito());
        SistemaPedidos sistema = SistemaPedidos.getInstancia();
        sistema.adicionarPedido(pedido);

        pedido.processarPagament();
    }
}
