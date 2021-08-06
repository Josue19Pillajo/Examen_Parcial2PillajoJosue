package dominio;

public class JubilacionVejez extends PersonaJubilada {

    public JubilacionVejez() {
        super(null, null, 0, 0);
    }

    public double CalculoDineroV(double pi, double salarioBase) {
        double total = pi + (salarioBase * 0.15);
        return total;

    }
}
