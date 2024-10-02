public class Game
{
    Player player1 = new Player();
    Player player2 = new Player();
    Result results = new Result();
    Input inputs = new Input();

    public void run()
    {
        int whoIsPlaying = 1;
        boolean isRunning = true;
        System.out.println();
        player1.setType("X");
        player2.setType("O");
        results.cleanTheDeck();
        System.out.println("Pick between 1-9 to chose your placement.");
        System.out.println(results.outLay());
        while(isRunning)
        {
            if (whoIsPlaying >= 3)
            {
                whoIsPlaying = 1;
            }

            if (whoIsPlaying == 1)
            {
                System.out.println("Player 1" + " It's your turn!");
                inputs.playerInput(player1, results);
                if(results.whoWon(player1))
                {
                    System.out.println("Player 1" + " Wins!");
                    isRunning = false;
                }
            }
            else
            {
                System.out.println("Player 2" + " It's your turn!");
                inputs.playerInput(player2, results);
                if(results.whoWon(player2))
                {
                    System.out.println("Player 2" + " Wins!");
                    isRunning = false;
                }
            }
            if (results.boardIsFull())
            {
                System.out.println("Game end in a draw!");
                isRunning = false;
            }
            System.out.println(results.outLay());
            whoIsPlaying++;
        }
    }
}
