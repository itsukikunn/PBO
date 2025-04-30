package sigmastore;

public final class transaksi {
    public final String IDtransaksi;
    public String IDpelanggan;
    public String IDproduk;
    public double totalHarga;

    private static int totalTransaksi = 0;

    public transaksi(String IDtransaksi, String IDpelanggan, String IDproduk, double totalHarga) {
        this.IDtransaksi = IDtransaksi;
        this.IDpelanggan = IDpelanggan;
        this.IDproduk = IDproduk;
        this.totalHarga = totalHarga;

        totalTransaksi++;
    }

    public static int getTotalTransaksi() {
        return totalTransaksi;
    }

    @Override
    public final String toString() {
        return "ID: " + IDtransaksi + ", Pelanggan: " + IDpelanggan + ", Produk: " + IDproduk + ", Total Harga: " + totalHarga;
    }
}
