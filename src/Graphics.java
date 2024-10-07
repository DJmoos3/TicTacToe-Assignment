import java.util.Arrays;

public class Graphics
{
    //All the strings used to make the game-board and check who wins
    private String placableSpots[] = new String[9];
    private String line1;
    private String line2;
    private String line3;
    private String verticalLine1;
    private String verticalLine2;
    private String verticalLine3;
    private String diagonalLine1;
    private String diagonalLine2;

    //This is used to clean all the values in the code so one can play another round afterwards.
    public void cleanTheDeck()
    {
        Arrays.fill(placableSpots, "-");
        setLine1("");
        setLine2("");
        setLine3("");
        setVerticalLine1("");
        setVerticalLine2("");
        setVerticalLine3("");
        setDiagonalLine1("");
        setDiagonalLine2("");
    }

    //This is what writes out the outlay of the game-board in the console.
    public String outLay()
    {
        return placableSpots[0] + "|" + placableSpots[1] + "|"+ placableSpots[2] + "\n" + placableSpots[3] + "|"
                + placableSpots[4] + "|" + placableSpots[5] + "\n"+ placableSpots[6] + "|" + placableSpots[7] + "|"
                + placableSpots[8];
    }
    //This is for the whole array
    public String[] getPlacableSpots() {
        return placableSpots;
    }
    //While this is to get in the specified location
    public String getPlacableSpots(int placing) {
        return placableSpots[placing];
    }
    //And this to set in specified location
    public void setPlacableSpots(String string, int placing) {
        this.placableSpots[placing] = string;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getLine3() {
        return line3;
    }

    public void setLine3(String line3) {
        this.line3 = line3;
    }

    public String getDiagonalLine1() {
        return diagonalLine1;
    }

    public void setDiagonalLine1(String diagonalLine1) {
        this.diagonalLine1 = diagonalLine1;
    }

    public String getDiagonalLine2() {
        return diagonalLine2;
    }

    public void setDiagonalLine2(String diagonalLine2) {
        this.diagonalLine2 = diagonalLine2;
    }

    public String getVerticalLine1() {
        return verticalLine1;
    }

    public void setVerticalLine1(String verticalLine1) {
        this.verticalLine1 = verticalLine1;
    }

    public String getVerticalLine2() {
        return verticalLine2;
    }

    public void setVerticalLine2(String verticalLine2) {
        this.verticalLine2 = verticalLine2;
    }

    public String getVerticalLine3() {
        return verticalLine3;
    }

    public void setVerticalLine3(String verticalLine3) {
        this.verticalLine3 = verticalLine3;
    }
}
