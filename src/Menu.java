import java.util.Scanner;

public class Menu
{
    private int answer;
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while(isRunning)
        {
            System.out.println("Welcome to Tic Tac Toe\nWhat do you wanna do?");
            System.out.println("1: Play");
            System.out.println("2: Quit");
            if (scanner.hasNextInt())
            {
                setAnswer(scanner.nextInt());
                if (getAnswer() > 0 && getAnswer() < 3)
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
