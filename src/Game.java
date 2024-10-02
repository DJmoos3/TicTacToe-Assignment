public class Game
{
    Player player1 = new Player();
    Player player2 = new Player();
    Result results = new Result();
    Input inputs = new Input();

    //This is where the game itself runs
    public void run()
    {
        int whoIsPlaying = 1;
        boolean isRunning = true;
        System.out.println();
        player1.player("Kalle", "X");
        player2.player("Daniel","O");
        results.cleanTheDeck();
        System.out.println("Pick between 1-9 to chose your placement.");
        System.out.println(results.outLay());

        //This loop keeps the game running until either one has won or that it ends in a draw.
        while(isRunning)
        {
            if (whoIsPlaying >= 3)
            {
                whoIsPlaying = 1;
            }

            if (whoIsPlaying == 1)
            {
                System.out.println(player1.getName() + " It's your turn!");
                inputs.playerInput(player1, results);
                if(results.whoWon(player1))
                {
                    System.out.println(player1.getName() + " Wins!");
                    isRunning = false;
                }
            }
            else
            {
                System.out.println(player2.getName() + " It's your turn!");
                inputs.playerInput(player2, results);
                if(results.whoWon(player2))
                {
                    System.out.println(player2.getName() + " Wins!");
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
