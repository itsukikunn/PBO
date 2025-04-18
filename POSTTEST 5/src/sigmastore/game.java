package sigmastore;

public class game {
    private String IDgame;
    private String Namagame;
    private String Devgame;

    public game(String IDgame, String Namagame, String Devgame) {
        this.IDgame = IDgame;
        this.Namagame = Namagame;
        this.Devgame = Devgame;
    }

    public String getIDgame() {
        return IDgame;
    }

    public String getNamagame() {
        return Namagame;
    }

    public String getDevgame() {
        return Devgame;
    }

    public void setNamagame(String Namagame) {
        this.Namagame = Namagame;
    }

    public void setDevgame(String Devgame) {
        this.Devgame = Devgame;
    }

    @Override
    public String toString() {
        return "ID Game: " + IDgame + ", Nama Game: " + Namagame + ", Developer: " + Devgame;
    }
}
