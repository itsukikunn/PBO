package sigmastore;

public class produk {
    public enum JenisProduk {
        DIAMOND, ITEM;
    }

    private String IDproduk;
    private int stok;
    private JenisProduk jenisProduk;
    private double harga;
    private String IDgame;

    public produk(String IDproduk, int stok, JenisProduk jenisProduk, double harga, String IDgame) {
        this.IDproduk = IDproduk;
        this.stok = stok;
        this.jenisProduk = jenisProduk;
        this.harga = harga;
        this.IDgame = IDgame;
    }

    public String getIDproduk() {
        return IDproduk;
    }

    public void setIDproduk(String IDproduk) {
        this.IDproduk = IDproduk;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public JenisProduk getJenisProduk() {
        return jenisProduk;
    }

    public void setJenisProduk(JenisProduk jenisProduk) {
        this.jenisProduk = jenisProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getIDgame() {
        return IDgame;
    }

    public void setIDgame(String IDgame) {
        this.IDgame = IDgame;
    }

    @Override
    public String toString() {
        return "ID Produk: " + IDproduk + ", Stok: " + stok + ", Jenis: " + jenisProduk +
               ", Harga: " + harga + ", ID Game: " + IDgame;
    }
}