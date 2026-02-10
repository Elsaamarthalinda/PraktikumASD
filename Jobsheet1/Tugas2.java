package Jobsheet1;
import java.util.Scanner;
public class Tugas2 {
    static Scanner sc = new Scanner(System.in);

    static void inputJadwal(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i+1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari             : ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam              : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\n================= JADWAL KULIAH =================");
        System.out.printf("%-25s %-20s %-10s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-20s %-10s %-15s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    static void cariHari(String[][] jadwal, int n) {
        System.out.print("\nMasukkan hari yang dicari: ");
        String cari = sc.nextLine();
        boolean ketemu = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(cari)) {
                System.out.printf("%-25s %-20s %-10s %-15s\n",
                        jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ketemu = true;
            }
        }

        if (!ketemu) System.out.println("Tidak ada jadwal di hari tersebut.");
    }

    static void cariMK(String[][] jadwal, int n) {
        System.out.print("\nMasukkan mata kuliah: ");
        String cari = sc.nextLine();
        boolean ketemu = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(cari)) {
                System.out.printf("%-25s %-20s %-10s %-15s\n",
                        jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ketemu = true;
            }
        }

        if (!ketemu) System.out.println("Mata kuliah tidak ditemukan.");
    }

    public static void main(String[] args) {

        System.out.print("Jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);

        int menu;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tampilkan Semua Jadwal");
            System.out.println("2. Cari Berdasarkan Hari");
            System.out.println("3. Cari Berdasarkan Mata Kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1: tampilSemua(jadwal, n); break;
                case 2: cariHari(jadwal, n); break;
                case 3: cariMK(jadwal, n); break;
            }

        } while (menu != 4);

        System.out.println("Program selesai.");
    }
}