import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);
    String respuesta;

    public String imprimirMenu(){
        System.out.println("""
                *********************************************
                Bienvenido al conversor de monedas!
                Elige una opción:
                1) Dolar =>> Peso Argentino
                2) Peso argentino =>> Dolar
                3) Dolar =>> Real Brasileño
                4) Real Brasileño =>> Dolar
                5) Dolar =>> Peso Colombiano
                6) Peso Colombiano =>> Dolar
                7) Salir
                Elija una opción valida:
                ********************************************
                """);
        respuesta = teclado.nextLine();
        return respuesta;
    }
}
