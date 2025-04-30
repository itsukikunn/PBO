package sigmastore;

public abstract class produk {
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

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getIDgame() {
        return IDgame;
    }

    public void setIDgame(String IDgame) {
        this.IDgame = IDgame;
    }

    public abstract String deskripsiProduk();

    @Override
    public String toString() {
        return "ID Produk: " + IDproduk + ", Stok: " + stok + ", Jenis: " + jenisProduk +
               ", Harga: " + harga + ", ID Game: " + IDgame;
    }

    public static class diamond extends produk {
        private int jumlahDiamond;
    
        public diamond(String IDproduk, int stok, double harga, String IDgame, int jumlahDiamond) {
            super(IDproduk, stok, JenisProduk.DIAMOND, harga, IDgame);
            if (jumlahDiamond <= 0) {
                throw new IllegalArgumentException("Jumlah diamond harus lebih besar dari 0.");
            }
            this.jumlahDiamond = jumlahDiamond;
        }
    
        public int getJumlahDiamond() {
            return jumlahDiamond;
        }
    
        public void setJumlahDiamond(int jumlahDiamond) {
            if (jumlahDiamond <= 0) {
                throw new IllegalArgumentException("Jumlah diamond harus lebih besar dari 0.");
            }
            this.jumlahDiamond = jumlahDiamond;
        }
    
        @Override
        public String deskripsiProduk() {
            return "Diamond " + getIDproduk() + ": " + getJumlahDiamond() + " diamond untuk game " + getIDgame();
        }
    
        @Override
        public String toString() {
            return super.toString() + ", Jumlah Diamond Per Stok: " + jumlahDiamond;
        }
    }
    

    public static class item extends produk {
        private String durasiItem;
    
        public item(String IDproduk, int stok, double harga, String IDgame, String durasiItem) {
            super(IDproduk, stok, JenisProduk.ITEM, harga, IDgame);
            this.durasiItem = durasiItem;
        }
    
        public String getDurasiItem() {
            return durasiItem;
        }
    
        public void setDurasiItem(String durasiItem) {
            this.durasiItem = durasiItem;
        }
    
        @Override
        public String deskripsiProduk() {
            return "Item " + getIDproduk() + ": durasi " + durasiItem + " untuk game " + getIDgame();
        }
    
        @Override
        public String toString() {
            return super.toString() + ", Durasi Item: " + durasiItem;
        }
    }
}    
