package CRUD;
import sigmastore.produk;

public class ProdukCRUD extends crud<produk> {
    public void edit(String IDproduk, int stokBaru, double hargaBaru) {
        for (produk p : list) {
            if (p.getIDproduk().equals(IDproduk)) {
                p.setStok(stokBaru);
                p.setHarga(hargaBaru);
                System.out.println("Produk berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Error: Produk tidak ditemukan.");
    }
}
