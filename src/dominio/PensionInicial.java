package dominio;

public interface PensionInicial {

    int SALBASICO = 400;

    default double calculoHasta10() {
        double pi = SALBASICO * 0.5;
        return pi;
    }

    default double calculo11_20() {
        double pi = SALBASICO * 0.6;
        return pi;
    }

    default double calculo21_30() {
        double pi = SALBASICO * 0.7;
        return pi;
    }

    default double calculo31_35() {
        double pi = SALBASICO * 0.8;
        return pi;
    }

    default double calculo36_39() {
        double pi = SALBASICO * 0.9;
        return pi;
    }

    default double calculo40() {
        double pi = SALBASICO * 1;
        return pi;
    }

}
