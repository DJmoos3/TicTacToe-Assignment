import java.util.Scanner;

public class Menu
{
    private int answer;
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        //This loop starts up the menu to the game and won't start the game or quit it unless specified to do so.
        //while also checking whether the input is valid or not.
        while(isRunning)
        {
            System.out.println("Welcome to Tic Tac Toe\nWhat do you wanna do?");
            System.out.println("1: PVP\n2: PVE\n3: Scoreboard\n4: Quit");
            if (scanner.hasNextInt())
            {
                setAnswer(scanner.nextInt());
                if (getAnswer() > 0 && getAnswer() < 5)
                {
                    isRunning = false;
                }
            }
            else
            {
                scanner.nextLine();
                System.out.println("Wrong input");
            }
        }
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getAnswer() {
        return answer;
    }
}
