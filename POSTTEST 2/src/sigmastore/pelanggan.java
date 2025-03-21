package sigmastore;

public class pelanggan {
    private String IDpelanggan;
    private String Namapelanggan;

    public pelanggan(String IDpelanggan, String Namapelanggan) {
        this.IDpelanggan = IDpelanggan;
        this.Namapelanggan = Namapelanggan;
    }

    public String getIDpelanggan() {
        return IDpelanggan;
    }

    public String getNamapelanggan() {
        return Namapelanggan;
    }

    public void setNamapelanggan(String Namapelanggan) {
        this.Namapelanggan = Namapelanggan;
    }

    @Override
    public String toString() {
        return "ID: " + IDpelanggan + ", Nama: " + Namapelanggan;
    }
}
