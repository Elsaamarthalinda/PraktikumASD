package Praktikum05;

import java.util.Scanner;
public class MainDosen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen07 list = new DataDosen07();
        int pilihan;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia Termuda - Bubble Sort)");
            System.out.println("4. Sorting DSC (Usia Tertua - Selection/Insertion Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode    : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama    : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jkChar = sc.next().charAt(0);
                    boolean jk = (jkChar == 'L' || jkChar == 'l');
                    System.out.print("Usia    : ");
                    int usia = sc.nextInt();
                    
                    Dosen07 d = new Dosen07(kode, nama, jk, usia);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.SortingASC();
                    System.out.println("\nData berhasil diurutkan ASC (Termuda).");
                    list.tampil();
                    break;

                case 4:
                    System.out.println("Pilih Metode (1. Selection / 2. Insertion): ");
                    int metode = sc.nextInt();
                    if (metode == 1) list.sortingDSC();
                    else list.insertionSort();
                    
                    System.out.println("\nData berhasil diurutkan DSC (Tertua).");
                    list.tampil();
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }
}