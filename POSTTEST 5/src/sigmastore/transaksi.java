package sigmastore;

public final class transaksi { 
    public final String IDtransaksi;
    public String IDpelanggan;
    public String IDproduk;
    public double totalHarga;
    
    public transaksi(String IDtransaksi, String IDpelanggan, String IDproduk, double totalHarga) {
        this.IDtransaksi = IDtransaksi; 
        this.IDpelanggan = IDpelanggan;
        this.IDproduk = IDproduk;
        this.totalHarga = totalHarga;
    }
    
    @Override
    public final String toString() { 
        return "ID: " + IDtransaksi + ", Pelanggan: " + IDpelanggan + ", Produk: " + IDproduk + ", Total Harga: " + totalHarga;
    }
}
