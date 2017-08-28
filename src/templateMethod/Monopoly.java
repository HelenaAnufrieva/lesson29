package templateMethod;

public class Monopoly extends Game{
    @Override
    protected void initializeGame() {
        System.out.println("Monopoly initialization");
    }

    @Override
    protected void playGame() {
        System.out.println("Monopoly playing");
    }

    @Override
    protected void endGame() {
        System.out.println("Monopoly ending");
    }

    @Override
    protected void printWinner() {
        System.out.println("Monopoly winner is...");
    }
}
