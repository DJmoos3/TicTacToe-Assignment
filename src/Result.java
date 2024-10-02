public class Result extends Graphics
{
    public boolean whoWon(Player player)
    {
        setLine1(getPlacableSpots(0) + getPlacableSpots(1) + getPlacableSpots(2));
        setLine2(getPlacableSpots(3) + getPlacableSpots(4) + getPlacableSpots(5));
        setLine3(getPlacableSpots(6) + getPlacableSpots(7) + getPlacableSpots(8));
        setVerticalLine1(getPlacableSpots(0) + getPlacableSpots(3) + getPlacableSpots(6));
        setVerticalLine2(getPlacableSpots(1) + getPlacableSpots(4) + getPlacableSpots(7));
        setVerticalLine3(getPlacableSpots(2) + getPlacableSpots(5) + getPlacableSpots(8));
        setDiagonalLine1(getPlacableSpots(0) + getPlacableSpots(4) + getPlacableSpots(8));
        setDiagonalLine2(getPlacableSpots(2) + getPlacableSpots(4) + getPlacableSpots(6));
        boolean isWinner = false;
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
        for (int i = 0; i < checkIfFull.length; i++)
        {
            if(checkIfFull[i] == null)
            {
                isBoardFull = false;
            }
        }
        return isBoardFull;
    }
}
