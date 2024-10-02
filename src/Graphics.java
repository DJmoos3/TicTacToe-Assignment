import java.util.Arrays;

public class Graphics
{
    private String placableSpots[] = new String[9];
    private String line1;
    private String line2;
    private String line3;
    private String diagonalLine1;
    private String diagonalLine2;

    public void cleanTheDeck()
    {
        Arrays.fill(placableSpots, "");
        setLine1("");
        setLine2("");
        setLine3("");
        setDiagonalLine1("");
        setDiagonalLine2("");
    }


    public String outLay()
    {
        return placableSpots[0] + "|" + placableSpots[1] + "|"+ placableSpots[2] + "\n" + placableSpots[3] + "|"
                + placableSpots[4] + "|" + placableSpots[5] + "\n"+ placableSpots[6] + "|" + placableSpots[7] + "|"
                + placableSpots[8];
    }

    public String getPlacableSpots(int placing) {
        return placableSpots[placing];
    }

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
}
