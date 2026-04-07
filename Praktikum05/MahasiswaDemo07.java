package Praktikum05;
import java.util.Scanner;

public class MahasiswaDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi07 list = new MahasiswaBerprestasi07(jmlMhs);


        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa07 m = new Mahasiswa07(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println();
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data setelah Selection Sort (ASC): ");
        list.selectionSort();
        list.tampil();

        System.out.println("--------------------------------------------");
        System.out.print("Masukkan IPK yang dicari: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan Sequential Search");
        int pss = list.sequentialSearching(cari);
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("----------------------------------");
        System.out.println("Menggunakan Binary Search");
        System.out.println("----------------------------------");
        int pss2 = list.findBinarySearch(cari, 0, list.idx - 1);
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        System.out.println("Data setelah Insertion Sort (DESC): ");
        list.insertionSort();
        list.tampil();
    }
}