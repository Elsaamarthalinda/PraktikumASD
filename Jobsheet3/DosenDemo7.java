package Jobsheet3;
import java.util.Scanner;
public class DosenDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Dosen7[] arrayOfDosen7 = new Dosen7[3];
        String kode, nama, dummy;
        boolean jenisKelamin;
        int usia;

        for (int i=0; i<3;i++) {
            System.out.println("Masukkan Data Dosen ke-" +(i+1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine(); 
            System.out.print("Jenis Kelamin : ");
            dummy = sc.nextLine();
            jenisKelamin = Boolean.parseBoolean(dummy);
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("---------------------------------------");

            arrayOfDosen7[i] = new Dosen7(kode, nama, jenisKelamin, usia);
        }

        DataDosen7 data = new DataDosen7();

        System.out.println("---- Semua Data Dosen ----");
        data.dataSemuaDosen7(arrayOfDosen7);
        System.out.println();
        System.out.println("---- Jumlah Dosen Per Jenis Kelamin ----");
        data.jumlahDosenPerJenisKelamin(arrayOfDosen7);
        System.out.println();
        System.out.println("---- Rata-Rata Usia Per Jenis Kelamin ----");
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen7);
        System.out.println();
        System.out.println("---- Dosen Paling Tua ----");
        data.infoDosenPalingTua(arrayOfDosen7);
        System.out.println();
        System.out.println("---- Dosen Paling Muda ----");
        data.infoDosenPalingMuda(arrayOfDosen7);
    }
}
