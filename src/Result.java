public class Result extends Graphics
{
    public boolean whoWon(Player player)
    {
        /*
        These lines take the different values of the array from the Graphics class to then put them in different
        axes to then use them as answers whether they connect as a line or not.
        */
        setLine1(getPlacableSpots(0) + getPlacableSpots(1) + getPlacableSpots(2));
        setLine2(getPlacableSpots(3) + getPlacableSpots(4) + getPlacableSpots(5));
        setLine3(getPlacableSpots(6) + getPlacableSpots(7) + getPlacableSpots(8));
        setVerticalLine1(getPlacableSpots(0) + getPlacableSpots(3) + getPlacableSpots(6));
        setVerticalLine2(getPlacableSpots(1) + getPlacableSpots(4) + getPlacableSpots(7));
        setVerticalLine3(getPlacableSpots(2) + getPlacableSpots(5) + getPlacableSpots(8));
        setDiagonalLine1(getPlacableSpots(0) + getPlacableSpots(4) + getPlacableSpots(8));
        setDiagonalLine2(getPlacableSpots(2) + getPlacableSpots(4) + getPlacableSpots(6));
        boolean isWinner = false;
        //This is where we use those lines to check who wins.
        if(player.getType().equalsIgnoreCase("X"))
        {
            if (getLine1().equalsIgnoreCase("xxx")||getLine2().equalsIgnoreCase("xxx")
                    ||getLine3().equalsIgnoreCase("xxx") ||
                    getDiagonalLine1().equalsIgnoreCase("xxx") ||
                    getDiagonalLine2().equalsIgnoreCase("xxx") ||
                    getVerticalLine1().equalsIgnoreCase("xxx") ||
                    getVerticalLine2().equalsIgnoreCase("xxx") ||
                    getVerticalLine3().equalsIgnoreCase("xxx"))
            {
                isWinner =true;
            }
        }
        if (player.getType().equalsIgnoreCase("O"))
        {
            if (getLine1().equalsIgnoreCase("ooo")||getLine2().equalsIgnoreCase("ooo")
                    ||getLine3().equalsIgnoreCase("ooo") ||
                    getDiagonalLine1().equalsIgnoreCase("ooo") ||
                    getDiagonalLine2().equalsIgnoreCase("ooo") ||
                    getVerticalLine1().equalsIgnoreCase("ooo") ||
                    getVerticalLine2().equalsIgnoreCase("ooo") ||
                    getVerticalLine3().equalsIgnoreCase("ooo"))
            {
                isWinner =true;
            }
        }

        return isWinner;

    }
    //This method is used to find out whether the board is full or not to decide if the game is a draw.
    public boolean boardIsFull()
    {
        boolean isBoardFull = true;
        String checkIfFull[] = new String[getPlacableSpots().length];
        for (int i = 0; i < getPlacableSpots().length; i++)
        {
            if (getPlacableSpots(i).equalsIgnoreCase("x") || getPlacableSpots(i).equalsIgnoreCase("o"))
            {
               checkIfFull[i] = getPlacableSpots(i);
            }
        }
        for (String s : checkIfFull) {
            if (s == null) {
                isBoardFull = false;
                break;
            }
        }
        return isBoardFull;
    }
}
