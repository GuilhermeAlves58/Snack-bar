package pagamento;

public interface PagamentoStrategy {
    void pagar(double valor);
}

public class CartaoCredito implements PagamentoStrategy {
    public void pagar(double valor) {
        System.out.println("Pago R$" + valor + " no Cartão de Crédito.");
    }
}

public class Dinheiro implements PagamentoStrategy {
    public void pagar(double valor) {
        System.out.println("Pago R$" + valor + " em Dinheiro.");
    }
}