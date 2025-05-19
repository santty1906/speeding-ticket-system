import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        Conductor conductor = new Conductor();

        try {
            while (true) {
                System.out.print("Ingrese el ID del conductor (solo letras y números, sin espacios): ");
                String id = lector.readLine();
                if (id.matches("[a-zA-Z0-9]+")) {
                    conductor.setId(id);
                    break;
                } else {
                    System.out.println("El ID solo debe tener letras y números, sin espacios ni símbolos. Por favor intente nuevamente");
                }
            }

            while (true) {
                System.out.print("Ingrese el nombre del conductor: ");
                String nombre = lector.readLine();
                if (nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                    conductor.setNombre(nombre);
                    break;
                } else {
                    System.out.println("El nombre solo debe tener letras y espacios. Por favor intente nuevamente");
                }
            }

            while (true) {
                try {
                    System.out.print("Ingrese el tipo de vía (1 = Residencial, 2 = Escolar, 3 = Autopista): ");
                    int tipoVia = Integer.parseInt(lector.readLine());
                    if (tipoVia >= 1 && tipoVia <= 3) {
                        conductor.setTipoVia(tipoVia);
                        break;
                    } else {
                        System.out.println("Error: El tipo de vía debe ser 1, 2 o 3.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Por favor intente nuevamente. Ingrese un número válido (1, 2 o 3).");
                }
            }

            while (true) {
                try {
                    System.out.print("Ingrese la velocidad registrada: ");
                    int velocidad = Integer.parseInt(lector.readLine());
                    if (velocidad >= 0) {
                        conductor.setVelocidadRegistrada(velocidad);
                        break;
                    } else {
                        System.out.println("Por favor intente nuevamente. La velocidad no puede ser negativa.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Por favor intente nuevamente. Ingrese un número válido para la velocidad.");
                }
            }

            int multa = Multa.calcularMulta(conductor.getTipoVia(), conductor.getVelocidadRegistrada());
            String nombreVia = Multa.obtenerNombreVia(conductor.getTipoVia());

            System.out.println("\nResultado");
            System.out.println("ID del conductor: " + conductor.getId());
            System.out.println("Nombre: " + conductor.getNombre());
            System.out.println("Tipo de vía: " + nombreVia);
            System.out.println("Velocidad registrada: " + conductor.getVelocidadRegistrada() + " km/h");

            if (multa > 0) {
                System.out.println("Multa a pagar: $" + multa);
            } else {
                System.out.println("No hay multa.");
            }

        } catch (IOException e) {
            System.out.println("Error de entrada o salida: " + e.getMessage());
        }
    }
}


