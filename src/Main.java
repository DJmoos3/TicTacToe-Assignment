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
            if (menu.getAnswer() == 1)
            {
                game.run();
            }
            else if (menu.getAnswer() == 2)
            {
                isRunning = false;
            }
        }
    }
}