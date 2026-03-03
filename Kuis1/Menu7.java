package Kuis1;
public class Menu7 {
    String nama;
    double harga;
    String kategori;

    public Menu7(String nama, double harga, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }

    void tampilkanDetail() {
        System.out.printf("| %-15s | %-12s | Rp%-11.2f |\n", nama, kategori, harga);
    }

    double hitungPotongan() {
        return 0.15 * harga;
    }

    void setKategoriBaru(String kategoriBaru) {
        this.kategori = kategoriBaru;
        System.out.println("Kategori " + nama + " telah diperbarui!");
    }
}