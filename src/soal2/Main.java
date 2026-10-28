package soal2;

public class Main {
    public static void main(String[] args) {
        Sepeda sepeda1 = new Sepeda("S001", "Gunung", 3, 15000);
        Sepeda sepeda2 = new Sepeda("S002", "Lipat", 2, 12000);

        sepeda1.tampilData();
        System.out.println();
        sepeda2.tampilData();
    }
}
