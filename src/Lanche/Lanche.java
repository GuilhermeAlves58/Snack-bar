package Lanche;

public abstract class Lanche {
    public abstract String getDescricao();
    public abstract double getPreco();
}

public class XBurger extends Lanche {
    public String getDescricao() { return "X-Burger"; }
    public double getPreco() { return 10.0; }
}

public class QueijoExtra extends Lanche {
    private Lanche lanche;
    public QueijoExtra(Lanche lanche) { this.lanche = lanche; }

    public QueijoExtra(Lanche lanche) {
        super();
    }

    public String getDescricao() {
        return lanche.getDescricao() + " + Queijo Extra";
    }

    public double getPreco() {
        return lanche.getPreco() + 2.0;
    }
}

