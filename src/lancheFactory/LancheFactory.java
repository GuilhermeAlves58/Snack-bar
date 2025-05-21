package lancheFactory;

public abstract class LancheFactory {
    public abstract Lanche criarLanche(String tipo);
}

public class ConcreteLancheFactory extends LancheFactory {
    public Lanche criarLanche(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "xburger" -> new XBurger();
            case "xsalada" -> new XSalada();
            default -> throw new IllegalArgumentException("Tipo inválido");
        };
    }
}