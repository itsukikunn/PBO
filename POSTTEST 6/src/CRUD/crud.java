    package CRUD;
    import java.util.ArrayList;

    public class crud<T> {
        protected ArrayList<T> list = new ArrayList<>();

        public void tambah(T item) {
            list.add(item);
            System.out.println("Data berhasil ditambahkan!");
        }

        public void lihat() {
            if (list.isEmpty()) {
                System.out.println("Belum ada data yang terdaftar.");
            } else {
                System.out.println("\nDaftar Data:");
                for (T item : list) {
                    System.out.println(item);
                }
            }
        }

        public void hapus(String id, Identifiable<T> identifier) {
            for (T item : list) {
                if (identifier.identify(item).equals(id)) {
                    list.remove(item);
                    System.out.println("Data berhasil dihapus!");
                    return;
                }
            }
            System.out.println("Error: Data tidak ditemukan.");
        }

        public interface Identifiable<T> {
            String identify(T item);
        }
    }
