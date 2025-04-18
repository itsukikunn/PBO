package CRUD;
import sigmastore.pelanggan;

public class PelangganCRUD extends crud<pelanggan> {
    public void edit(String IDpelanggan, String NamaBaru) {
        for (pelanggan p : list) {
            if (p.getIDpelanggan().equals(IDpelanggan)) {
                p.setNamapelanggan(NamaBaru);
                System.out.println("Pelanggan berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Error: Pelanggan tidak ditemukan.");
    }
}
