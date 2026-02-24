package Jobsheet3;
import java.util.Scanner;
public class MatakuliahDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah7[] arrayOfMatakuliah = new Matakuliah7[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("----------------------------------------");

            arrayOfMatakuliah[i] = new Matakuliah7(kode, nama, sks, jumlahJam);
        }
        
        for(int i=0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }

        System.out.println("== Tambah Data Matakuliah Baru ==");
        System.out.print("Kode       : ");
        kode = sc.nextLine();
        System.out.print("Nama       : ");
        nama = sc.nextLine();
        System.out.print("Sks        : ");
        sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam : ");
        jumlahJam = Integer.parseInt(sc.nextLine());

        arrayOfMatakuliah[0].tambahData(kode, nama, sks, jumlahJam);

        System.out.println("Data ke-1 telah ditambah:");
        arrayOfMatakuliah[0].cetakInfo();
    }
}