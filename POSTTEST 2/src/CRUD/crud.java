package CRUD;

import sigmastore.pelanggan;
import sigmastore.game;
import sigmastore.produk;
import java.util.ArrayList;

public class crud {
    private static ArrayList<pelanggan> pelangganList = new ArrayList<>();
    private static ArrayList<game> gameList = new ArrayList<>();
    private static ArrayList<produk> produkList = new ArrayList<>();

    public static void tambahpelanggan(String IDpelanggan, String Namapelanggan) {
        pelangganList.add(new pelanggan(IDpelanggan, Namapelanggan));
        System.out.println("Pelanggan berhasil ditambahkan!");
    }

    public static void lihatpelanggan() {
        if (pelangganList.isEmpty()) {
            System.out.println("Belum ada pelanggan yang terdaftar.");
        } else {
            System.out.println("\nDaftar Pelanggan:");
            for (pelanggan p : pelangganList) {
                System.out.println(p);
            }
        }
    }

    public static void editpelanggan(String IDpelanggan, String NamaBaru) {
        for (pelanggan p : pelangganList) {
            if (p.getIDpelanggan().equals(IDpelanggan)) {
                p.setNamapelanggan(NamaBaru);
                System.out.println("Pelanggan berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Error: Pelanggan tidak ditemukan.");
    }

    public static void hapuspelanggan(String IDpelanggan) {
        for (pelanggan p : pelangganList) {
            if (p.getIDpelanggan().equals(IDpelanggan)) {
                pelangganList.remove(p);
                System.out.println("Pelanggan berhasil dihapus!");
                return;
            }
        }
        System.out.println("Error: Pelanggan tidak ditemukan.");
    }

    public static void tambahgame(String IDgame, String Namagame, String Devgame) {
        gameList.add(new game(IDgame, Namagame, Devgame));
        System.out.println("Game berhasil ditambahkan!");
    }

    public static void lihatgame() {
        if (gameList.isEmpty()) {
            System.out.println("Belum ada game yang terdaftar.");
        } else {
            System.out.println("\nDaftar Game:");
            for (game g : gameList) {
                System.out.println(g);
            }
        }
    }

    public static void editgame(String IDgame, String NamaBaru, String DevBaru) {
        for (game g : gameList) {
            if (g.getIDgame().equals(IDgame)) {
                g.setNamagame(NamaBaru);
                g.setDevgame(DevBaru);
                System.out.println("Game berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Error: Game tidak ditemukan.");
    }

    public static void hapusgame(String IDgame) {
        for (game g : gameList) {
            if (g.getIDgame().equals(IDgame)) {
                gameList.remove(g);
                System.out.println("Game berhasil dihapus!");
                return;
            }
        }
        System.out.println("Error: Game tidak ditemukan.");
    }

    public static void tambahproduk(String IDproduk, int stok, String jenisProdukStr, double harga, String IDgame) {
        try {
            produk.JenisProduk jenisProduk = produk.JenisProduk.valueOf(jenisProdukStr.toUpperCase());
            produk produkBaru = new produk(IDproduk, stok, jenisProduk, harga, IDgame);
            produkList.add(produkBaru);
            System.out.println("Produk berhasil ditambahkan!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Jenis produk harus 'diamond' atau 'item'.");
        }
    }

    public static void lihatproduk() {
        if (produkList.isEmpty()) {
            System.out.println("Belum ada produk yang terdaftar.");
        } else {
            System.out.println("\nDaftar Produk:");
            for (produk p : produkList) {
                System.out.println(p);
            }
        }
    }

    public static void editproduk(String IDproduk, int stokBaru, double hargaBaru) {
        for (produk p : produkList) {
            if (p.getIDproduk().equals(IDproduk)) {
                p.setStok(stokBaru);
                p.setHarga(hargaBaru);
                System.out.println("Produk berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Error: Produk tidak ditemukan.");
    }

    public static void hapusproduk(String IDproduk) {
        for (produk p : produkList) {
            if (p.getIDproduk().equals(IDproduk)) {
                produkList.remove(p);
                System.out.println("Produk berhasil dihapus!");
                return;
            }
        }
        System.out.println("Error: Produk tidak ditemukan.");
    }
}
