package soal3;

public class Menu {
    private String kodeMenu;
    private String namaMenu;
    private double harga;
    private String kategori;

    public Menu() {
        this("M00", "Menu Umum", 0, "Lainnya");
    }

    public Menu(String kodeMenu, String namaMenu, double harga, String kategori) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }

    public void tampilMenu() {
        System.out.println("Kode   : " + kodeMenu);
        System.out.println("Nama   : " + namaMenu);
        System.out.printf("Harga  : %.0f%n", harga);
        System.out.println("Kategori: " + kategori);
    }

    public double hitungHarga(int jumlah) {
        return harga * jumlah;
    }
}
