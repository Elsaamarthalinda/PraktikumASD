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
            System.out.println("Kode       : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMatakuliah[i].nama);
            System.out.println("Sks        : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("----------------------------------------");

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
        System.out.println("Kode       : " + arrayOfMatakuliah[0].kode);
        System.out.println("Nama       : " + arrayOfMatakuliah[0].nama);
        System.out.println("Sks        : " + arrayOfMatakuliah[0].sks);
        System.out.println("Jumlah Jam : " + arrayOfMatakuliah[0].jumlahJam);
        System.out.println("----------------------------------------");

    }
}