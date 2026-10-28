package soal5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Tiket> daftarTiket = new ArrayList<>();

        System.out.print("Jumlah data tiket: ");
        int banyak = bacaJumlah(input);

        for (int i = 1; i <= banyak; i++) {
            System.out.println("\nData tiket ke-" + i);
            System.out.print("Kode tiket: ");
            String kode = input.nextLine();
            System.out.print("Nama film: ");
            String film = input.nextLine();
            System.out.print("Jenis tiket: ");
            String jenis = input.nextLine();
            double harga = bacaHarga(input);
            System.out.print("Jumlah tiket: ");
            int jumlah = bacaJumlah(input);
            daftarTiket.add(new Tiket(kode, film, jenis, harga, jumlah));
        }

        System.out.println("\n========================================");
        System.out.println("          DATA PEMESANAN TIKET");
        System.out.println("========================================");
        for (Tiket tiket : daftarTiket) {
            tiket.tampilData();
            System.out.println("----------------------------------------");
        }
        input.close();
    }

    private static int bacaJumlah(Scanner input) {
        while (true) {
            String teks = input.nextLine();
            try {
                int nilai = Integer.parseInt(teks);
                if (nilai > 0) return nilai;
            } catch (NumberFormatException ignored) { }
            System.out.print("Masukkan bilangan bulat lebih dari 0: ");
        }
    }

    private static double bacaHarga(Scanner input) {
        while (true) {
            System.out.print("Harga tiket: ");
            String teks = input.nextLine();
            try {
                double nilai = Double.parseDouble(teks);
                if (nilai >= 0) return nilai;
            } catch (NumberFormatException ignored) { }
            System.out.println("Harga harus berupa angka nol atau lebih.");
        }
    }
}
