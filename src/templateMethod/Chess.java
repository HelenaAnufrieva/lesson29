package templateMethod;

public class Chess extends Game {
    @Override
    protected void initializeGame() {
        System.out.println("Chess initialising");
    }

    @Override
    protected void playGame() {
        System.out.println("Chess playing");
    }

    @Override
    protected void endGame() {
        System.out.println("Chess ending");
    }

    @Override
    protected void printWinner() {
        System.out.println("Chess winner is...");
    }
}
