import java.util.Scanner;

public class Input
{
    Scanner scanner = new Scanner(System.in);

    public void playerInput(Player player, Result results)
    {
        int choosenPlacement;

        boolean hasPlaced = false;

        /*This loop places the players designated type at specified location if it's not already taken.
        While keeping check whether the input is valid or not*/
        while (!hasPlaced) {
            System.out.println("What place do you wanna place your piece?");
            if (scanner.hasNextInt())
            {
                choosenPlacement = scanner.nextInt();
                choosenPlacement--;
                scanner.nextLine();
                if (results.getPlacableSpots(choosenPlacement).equalsIgnoreCase("-"))
                {
                    results.setPlacableSpots(player.getType(), choosenPlacement);
                    hasPlaced = true;
                }
                else
                {
                    System.out.println("that placement is already taken\nTry again");
                }
            }
            else
            {
                System.out.println("Wrong type of input.");
            }
        }
    }
}
