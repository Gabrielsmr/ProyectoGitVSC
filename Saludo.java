public class Saludos {

    public void saludoInicial() {
        System.out.println("¡Hola! Bienvenido.");
    }

    public void despedida() {
        System.out.println("¡Adiós! Hasta luego.");
    }

    public static void main(String[] args) {
        Saludos s = new Saludos();
        s.saludoInicial();
        s.despedida();
    }
}
