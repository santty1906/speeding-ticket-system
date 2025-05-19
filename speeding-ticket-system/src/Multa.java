public class Multa {
    public static int obtenerVelocidadPermitida(int tipoVia) {
        return switch (tipoVia) {
            case 1 -> 40; // Residencial
            case 2 -> 25; // Escolar
            case 3 -> 100; // Autopista
            default -> 0;
        };
    }

    public static int obtenerMontoPorKm(int tipoVia) {
        return switch (tipoVia) {
            case 1 -> 5;
            case 2 -> 10;
            case 3 -> 2;
            default -> 0;
        };
    }

    public static int calcularMulta(int tipoVia, int velocidadRegistrada) {
        int velocidadPermitida = obtenerVelocidadPermitida(tipoVia);
        int montoPorKm = obtenerMontoPorKm(tipoVia);
        int exceso = velocidadRegistrada - velocidadPermitida;

        if (exceso > 0) {
            return exceso * montoPorKm;
        } else {
            return 0;
        }
    }

    public static String obtenerNombreVia(int tipoVia) {
        return switch (tipoVia) {
            case 1 -> "Residencial";
            case 2 -> "Escolar";
            case 3 -> "Autopista";
            default -> "";
        };
    }
}

