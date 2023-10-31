package Consumer;

public class User {
    private String nameTag;
    private int games;

    public User(String nameTag, int games) {
        this.nameTag = nameTag;
        this.games = games;
    }

    public String getNameTag() {
        return nameTag;
    }

    public float getGames() {
        return games;
    }
}
