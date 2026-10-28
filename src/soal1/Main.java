package soal1;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("B001", "Laskar Pelangi", "Andrea Hirata", 85000);
        Buku buku2 = new Buku("B002", "Bumi", "Tere Liye", 95000);

        buku1.tampilData();
        System.out.println();
        buku2.tampilData();
    }
}
