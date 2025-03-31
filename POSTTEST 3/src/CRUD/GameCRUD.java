package CRUD;
import sigmastore.game;

public class GameCRUD extends crud<game> {
    public void edit(String IDgame, String NamaGameBaru, String DevGameBaru) {
        for (game g : list) {
            if (g.getIDgame().equals(IDgame)) {
                g.setNamagame(NamaGameBaru);
                g.setDevgame(DevGameBaru);
                System.out.println("Game berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Error: Game tidak ditemukan.");
    }
}
