package ex_23_07_10.nintendo;

public class Main {
    public static void main(String[] args) {
        playGame(new Mario());
        playGame(new Poke());
        playGame(new Dongmul());
        playGame(new Zelda());
    }

    public static void playGame(Game game) {
        game.start();
    }
}
