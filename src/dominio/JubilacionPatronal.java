package dominio;

public class JubilacionPatronal extends PersonaJubilada {

    public JubilacionPatronal() {
        super(null, null, 0, 0);
    }

    public double CalculoDineroP(double pi, double salarioBase, int op1) {
        double total = pi + (salarioBase * 0.02);
        if (op1 == 1) {
            total = (total * 0.1) + total;
        } else if (op1 == 2) {
            total = (total * 0.05) + total;
        }
       // System.out.println("Su pension total es: " + total);
return total;
    }
}
