import controller.Game;
import settings.Common;
import view.Graphic;


public class Main {


    public static void main(String[] args) {
        Graphic graphics = new Graphic();
        Game game = new Game();
        Common utils = new Common();

        utils.clearScreen();
        graphics.splashScreen();
        waiting(2000);

        //TODO START GAME
        game.startGame();
    }


    private static void waiting(int timeInMs) {
        try{
            Thread.sleep(timeInMs);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }


}