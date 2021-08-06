package dominio;

public class PersonaJubilada implements PensionInicial {

    private String nroCedula;
    private String nombre;
    private double salarioBase;
    private int aniosAporte;
    private double pensionFial;
    private String tipoJubilacion;

    public PersonaJubilada(String nroCedula, String nombre, double salarioBase, int aniosAporte) {
        this.nroCedula = nroCedula;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.aniosAporte = aniosAporte;
    }

    public double calculoPensionInicial(int aniosAporte) {
        double pi = 0;
        if (aniosAporte <= 10) {
            pi = calculoHasta10();
        } else if (aniosAporte <= 20 && aniosAporte >= 11) {
            pi = calculo11_20();
        } else if (aniosAporte <= 30 && aniosAporte >= 21) {
            pi = calculo21_30();
        } else if (aniosAporte <= 35 && aniosAporte >= 31) {
            pi = calculo31_35();
        } else if (aniosAporte <= 39 && aniosAporte >= 36) {
            pi = calculo36_39();
        } else if (aniosAporte >= 40) {
            pi = calculo40();
        }
        return pi;
    }

    public PersonaJubilada(String nroCedula, String nombre, double pensionFial, String tipoJubilacion) {
        this.nroCedula = nroCedula;
        this.nombre = nombre;
        this.pensionFial = pensionFial;
        this.tipoJubilacion = tipoJubilacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAniosAporte() {
        return aniosAporte;
    }

    public double getPensionFial() {
        return pensionFial;
    }

    @Override
    public String toString() {
        return this.nombre + " con nro. de cedula " + this.nroCedula + " tiene un tipo de " + this.tipoJubilacion + " y como pension final " + this.pensionFial;
    }

}
