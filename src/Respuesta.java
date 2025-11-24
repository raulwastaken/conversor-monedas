public class Respuesta {
    String respuesta;
    String monedaInicial;
    String monedaConvetida;

    public Respuesta(String respuesta) {
        this.respuesta = respuesta;
        switch (respuesta){
            case "1":
                this.monedaInicial = "USD";
                this.monedaConvetida ="ARS";
                break;
            case "2":
                this.monedaInicial = "ARS";
                this.monedaConvetida ="USD";
                break;
            case "3":
                this.monedaInicial = "USD";
                this.monedaConvetida ="BOB";
                break;
            case "4":
                this.monedaInicial = "BOB";
                this.monedaConvetida ="USD";
                break;
            case "5":
                this.monedaInicial = "USD";
                this.monedaConvetida ="COP";
                break;
            case "6":
                this.monedaInicial = "COP";
                this.monedaConvetida ="USD";
                break;
            default:
                this.monedaInicial = "USD";
                this.monedaConvetida ="USD";
        }
    }

}
