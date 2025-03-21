import CRUD.crud;
import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== SIGMASTORE MENU UTAMA =====");
            System.out.println("1. CRUD Pelanggan");
            System.out.println("2. CRUD Game");
            System.out.println("3. CRUD Produk");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    menuPelanggan();
                    break;
                case 2:
                    menuGame();
                    break;
                case 3:
                    menuProduk();
                    break;
                case 4:
                    System.out.println("Program Off...");
                    System.exit(0);
                default:
                    System.out.println("Tidak valid! Coba lagi");
            }
        }
    }

    private static void menuPelanggan() {
        while (true) {
            System.out.println("\n===== MENU CRUD PELANGGAN =====");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Lihat Pelanggan");
            System.out.println("3. Ubah Pelanggan");
            System.out.println("4. Hapus Pelanggan");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Pelanggan: ");
                    String IDpelanggan = scanner.nextLine();
                    System.out.print("Masukkan Nama Pelanggan: ");
                    String Namapelanggan = scanner.nextLine();
                    crud.tambahpelanggan(IDpelanggan, Namapelanggan);
                    break;
                case 2:
                    crud.lihatpelanggan();
                    break;
                case 3:
                    System.out.print("Masukkan ID Pelanggan yang ingin diubah: ");
                    String IDeditPelanggan = scanner.nextLine();
                    System.out.print("Masukkan Nama Baru: ");
                    String NamaBaru = scanner.nextLine();
                    crud.editpelanggan(IDeditPelanggan, NamaBaru);
                    break;
                case 4:
                    System.out.print("Masukkan ID Pelanggan yang ingin dihapus: ");
                    String IDhapusPelanggan = scanner.nextLine();
                    crud.hapuspelanggan(IDhapusPelanggan);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Tidak valid! Coba lagi");
            }
        }
    }

    private static void menuGame() {
        while (true) {
            System.out.println("\n===== MENU CRUD GAME =====");
            System.out.println("1. Tambah Game");
            System.out.println("2. Lihat Game");
            System.out.println("3. Ubah Game");
            System.out.println("4. Hapus Game");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Game: ");
                    String IDgame = scanner.nextLine();
                    System.out.print("Masukkan Nama Game: ");
                    String Namagame = scanner.nextLine();
                    System.out.print("Masukkan Developer Game: ");
                    String Devgame = scanner.nextLine();
                    crud.tambahgame(IDgame, Namagame, Devgame);
                    break;
                case 2:
                    crud.lihatgame();
                    break;
                case 3:
                    System.out.print("Masukkan ID Game yang ingin diubah: ");
                    String IDeditGame = scanner.nextLine();
                    System.out.print("Masukkan Nama Baru: ");
                    String NamaGameBaru = scanner.nextLine();
                    System.out.print("Masukkan Developer Baru: ");
                    String DevGameBaru = scanner.nextLine();
                    crud.editgame(IDeditGame, NamaGameBaru, DevGameBaru);
                    break;
                case 4:
                    System.out.print("Masukkan ID Game yang ingin dihapus: ");
                    String IDhapusGame = scanner.nextLine();
                    crud.hapusgame(IDhapusGame);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Tidak valid! Coba lagi");
            }
        }
    }

    private static void menuProduk() {
        while (true) {
            System.out.println("\n===== MENU CRUD PRODUK =====");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Lihat Produk");
            System.out.println("3. Ubah Produk");
            System.out.println("4. Hapus Produk");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Produk: ");
                    String IDproduk = scanner.nextLine();
                    System.out.print("Masukkan Stok: ");
                    int stok = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Jenis Produk (diamond/item): ");
                    String jenisProduk = scanner.nextLine();
                    System.out.print("Masukkan Harga: ");
                    double harga = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Masukkan ID Game: ");
                    String IDgameProduk = scanner.nextLine();
                    crud.tambahproduk(IDproduk, stok, jenisProduk, harga, IDgameProduk);
                    break;
                case 2:
                    crud.lihatproduk();
                    break;
                case 3:
                    System.out.print("Masukkan ID Produk yang ingin diubah: ");
                    String IDeditProduk = scanner.nextLine();
                    System.out.print("Masukkan Stok Baru: ");
                    int stokBaru = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Harga Baru: ");
                    double hargaBaru = scanner.nextDouble();
                    scanner.nextLine();
                    crud.editproduk(IDeditProduk, stokBaru, hargaBaru);
                    break;
                case 4:
                    System.out.print("Masukkan ID Produk yang ingin dihapus: ");
                    String IDhapusProduk = scanner.nextLine();
                    crud.hapusproduk(IDhapusProduk);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Tidak valid! Coba lagi");
            }
        }
    }
}
