package CRUD;
import sigmastore.produk;

public class ProdukCRUD extends crud<produk> {
    
    public void tambah(produk p) {
        for (produk existingProduct : list) {
            if (existingProduct.getIDproduk().equals(p.getIDproduk())) {
                if (existingProduct.getJenisProduk() == p.getJenisProduk()) {
                    System.out.println("Error: Produk dengan ID " + p.getIDproduk() + " sudah ada dengan jenis produk sama.");
                    return;
                }
            }
        }
        list.add(p);
        System.out.println("Data produk berhasil ditambahkan!");
    }

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

    public void lihatByJenis(produk.JenisProduk jenis) {
        boolean ditemukan = false;
        for (produk p : list) {
            if (p.getJenisProduk() == jenis) {
                if (p instanceof produk.diamond) {
                    produk.diamond d = (produk.diamond) p;
                    System.out.println("Produk Diamond: " + d.deskripsiProduk());
                } else if (p instanceof produk.item) {
                    produk.item i = (produk.item) p;
                    System.out.println("Produk Item: " + i.deskripsiProduk());
                }
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada produk dengan jenis " + jenis);
        }
    }
}
