public class Game
{
    Player player1 = new Player();
    Player player2 = new Player();
    Result results = new Result();
    Input inputs = new Input();

    public void run()
    {
        boolean isRunning = true;
        System.out.println();
        player1.setType("X");
        player2.setType("O");
        results.cleanTheDeck();
        inputs.playerInput(player1, results);
        System.out.println(results.outLay());
    }
}
