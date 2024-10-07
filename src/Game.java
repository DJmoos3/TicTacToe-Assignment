import java.util.Random;
import java.util.Scanner;

public class Game
{
    Player player1 = new Player("Player 1", "X");
    Player player2 = new Player("Player 2", "O");
    Player player3 = new Player("Computer", "O");
    Result results = new Result();
    Input inputs = new Input();

    Scanner scanner = new Scanner(System.in);

    private boolean isPVE = false;

    //This is where the game itself runs
    public void run()
    {
        int whoIsPlaying = 1;
        int computerPlacement;

        boolean isRunning = true;
        boolean computerHasCorrectNumber = false;

        Random random = new Random();

        //These add the players names but only if they haven't been changed before.
        if(player1.getName().equals("Player 1"))
        {
            System.out.println("What's Player 1s name?");
            player1.setName(scanner.nextLine());
        }

        if(!isPVE() && player2.getName().equals("Player 2"))
        {
            System.out.println("What's Player 2s name?");
            player2.setName(scanner.nextLine());
        }

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
                //have to check whether one wins every turn otherwise the game would not be able to be finished
                if(results.whoWon(player1))
                {
                    System.out.println(player1.getName() + " Wins!");
                    player1.setWins(player1.getWins() + 1);
                    isRunning = false;
                }
            }
            //This checks whether the game is playing against a computer or not
            else if (isPVE())
            {
                /*The "computer" is just a random number generator that when that numbers spot isn't taken. It places
                its mark there just as players do.*/
                System.out.println("Computer Placed");
                while(!computerHasCorrectNumber)
                {
                    computerPlacement = random.nextInt(9);
                    if (results.getPlacableSpots(computerPlacement).equalsIgnoreCase("-"))
                    {
                        results.setPlacableSpots(player3.getType(), computerPlacement);
                        computerHasCorrectNumber = true;
                    }
                }
                computerHasCorrectNumber = false;
                if(results.whoWon(player3))
                {
                    System.out.println(player3.getName() + " Wins!");
                    player3.setWins(player3.getWins() + 1);
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
                    player2.setWins(player2.getWins() + 1);
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
    //this is what shows the scoreboard from the menu.
    public String scoreBoard()
    {
        return player1.getName() + " Wins:" + player1.getWins() +
                "\n" + player2.getName() + " Wins:" + player2.getWins() +
                "\n" + player3.getName() + " Wins:" + player3.getWins();
    }

    //This is what decides whether the player plays against another player or the computer.
    public boolean isPVE() {
        return isPVE;
    }

    public void setPVE(boolean PVE) {
        isPVE = PVE;
    }
}
