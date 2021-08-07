package dominio;

public class JubilacionPorDiscapacidad extends PersonaJubilada {

public JubilacionPorDiscapacidad() {
super(null, null, 0, 0);
}

 public double CalculoDineroD(double pi, double salarioBase, double porDiscapacidad) {
 double total = pi + (salarioBase * (porDiscapacidad * 0.01));
 return total;

}
}
