public class Player
{
    //this class is used to initialize the Player with such as their name and type.
    private String name;
    private String type;
    private int wins = 0;

    public Player(String name, String type)
    {
        setName(name);
        setType(type);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
