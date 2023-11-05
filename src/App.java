import controller.GameController;

public class App {



    public static void main(String[] args) {
        String[] listaDePalavras = {"JAVA", "COMPUTADOR", "PROGRAMACAO", "DESENVOLVIMENTO"};
        GameController controlador = new GameController(listaDePalavras);
        controlador.iniciarJogo();
    }


}
