public class Main
{
    public static void main(String[] args)
    {
        //All of this is just what starts and keeps the game going
        Game game = new Game();
        Menu menu = new Menu();

        boolean isRunning = true;

        while (isRunning)
        {
            menu.run();
            //Player versus player
            if (menu.getAnswer() == 1)
            {
                game.run();
            }
            //Player versus computer
            else if(menu.getAnswer() == 2)
            {
                game.setPVE(true);
                game.run();
            }
            //Scoreboard
            else if(menu.getAnswer() == 3)
            {
                System.out.println(game.scoreBoard());
            }
            //Quit
            else if (menu.getAnswer() == 4)
            {
                isRunning = false;
            }
        }
    }
}