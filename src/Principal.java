import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Principal {
    static void main(String[] args) throws IOException, InterruptedException {
        Menu menu = new Menu();
        String opcion = "a";
        Scanner teclado = new Scanner(System.in);

        while (true) {

            opcion = menu.imprimirMenu();
            if (Objects.equals(opcion, "7")){
                break;
            }
            Respuesta monedas = new Respuesta(opcion);

            API api = new API(monedas.monedaInicial, monedas.monedaConvetida);

            float factorConversor = api.consultaAPI();

            System.out.println("Ingresa el valor que deseas convertir");

            String entrada = teclado.nextLine();

            float cantidad = Float.parseFloat(entrada);

            System.out.println("El valor " + cantidad + " [" + monedas.monedaInicial + "] corresponde al valor final de =>>> "
                    + cantidad * factorConversor + " [" + monedas.monedaConvetida + "]");


        }
    }
}
