package soal3;

public class Main {
    public static void main(String[] args) {
        Menu menuDefault = new Menu();
        Menu menu = new Menu("M01", "Nasi Goreng", 18000, "Makanan");

        System.out.println("Ekspektasi Output Kasir");
        System.out.println();
        System.out.println("Kode    : " + "M01");
        System.out.println("Nama    : Nasi Goreng");
        System.out.println("Harga   : 18000");
        System.out.println("Jumlah  : 2");
        System.out.printf("Total   : %.0f%n", menu.hitungHarga(2));
    }
}
