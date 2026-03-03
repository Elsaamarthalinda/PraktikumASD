package Kuis1;
import java.util.Scanner;
public class SistemKafe7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah item menu: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Menu7[] daftarMenu = new Menu7[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n--- Input Menu Ke-" + (i + 1) + " ---");
            System.out.print("Nama Menu : ");
            String nama = sc.nextLine();
            System.out.print("Harga     : ");
            double harga = sc.nextDouble();
            sc.nextLine();
            System.out.print("Kategori  : ");
            String kategori = sc.nextLine();
            System.out.println();

            daftarMenu[i] = new Menu7(nama, harga, kategori);
        }

        System.out.println("======= DAFTAR MENU KAFE =======");
        System.out.printf("| %-15s | %-12s | %-13s |\n", "Nama", "Kategori", "Harga");
        
        for (Menu7 m : daftarMenu) {
            m.tampilkanDetail();
        }

        System.out.println("\n--- Potongan Diskon 15% ---");
        for (Menu7 m : daftarMenu) {
            double diskon = m.hitungPotongan();
            double hargaAkhir = m.harga - diskon;
            System.out.println(m.nama + " | Potongan: Rp" + diskon + " | Total: Rp" + hargaAkhir);
        }

        if (daftarMenu.length > 0) {
            System.out.println("\n--- Update Data ---");
            daftarMenu[0].setKategoriBaru("Special Edisi Ramadhan");
            System.out.print("Data baru item: ");
            daftarMenu[0].tampilkanDetail();
        }

        sc.close();
    }
}