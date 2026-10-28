package soal4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pemeriksaan> daftar = new ArrayList<>();

        System.out.println("=== SISTEM DATA PEMERIKSAAN KLINIK ===");
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nData pemeriksaan ke-" + i);
            System.out.print("Nomor pemeriksaan: ");
            String nomor = input.nextLine();
            System.out.print("Nama pasien: ");
            String pasien = input.nextLine();
            System.out.print("Nama dokter: ");
            String dokter = input.nextLine();
            double biaya = bacaBiaya(input);
            daftar.add(new Pemeriksaan(nomor, pasien, dokter, biaya));
        }

        double totalSemua = 0;
        System.out.println("\n=== DAFTAR PEMERIKSAAN ===");
        for (Pemeriksaan p : daftar) {
            p.tampilData();
            totalSemua += p.hitungTotal();
            System.out.println("--------------------------");
        }
        System.out.printf("Total seluruh biaya: Rp%.0f%n", totalSemua);
        input.close();
    }

    private static double bacaBiaya(Scanner input) {
        while (true) {
            System.out.print("Biaya pemeriksaan: ");
            String teks = input.nextLine();
            try {
                double biaya = Double.parseDouble(teks);
                if (biaya >= 0) return biaya;
            } catch (NumberFormatException ignored) { }
            System.out.println("Masukkan biaya berupa angka nol atau lebih.");
        }
    }
}
