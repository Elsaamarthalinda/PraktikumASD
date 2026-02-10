package Jobsheet1;
import java.util.Scanner;
public class Pemilihan07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilaiTgs, nilaiKuis, nilaiUTS, nilaiUAS, nilaiAkhir;
        String nilaiAngka, status, nilaiHuruf = "";

        System.out.println("=== PROGRAM MENGHITUNG NILAI AKHIR ===");
        System.out.println("======================================");
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTgs = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = sc.nextInt();
        System.out.println("=====================================");
        System.out.println("=====================================");

        if (nilaiTgs < 0 || nilaiTgs > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100){
            System.out.println("Nilai Tidak Valid");
            System.out.println("=====================================");
            System.out.println("=====================================");
            return;
        }

        nilaiAkhir = (nilaiTgs * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
           nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
           nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else if (nilaiAkhir >= 0 && nilaiAkhir <= 39) {
            nilaiHuruf = "E";
        } else{
            nilaiHuruf = "Nilai Tidak Valid";
        }
        
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);

         if (nilaiAkhir >= 51) {
            status = "LULUS";
        } else {
            status = "TIDAK LULUS";
        }

        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println(status);
    }
}
