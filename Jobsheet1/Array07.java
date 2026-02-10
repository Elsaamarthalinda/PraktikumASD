package Jobsheet1;
import java.util.Scanner;
public class Array07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = sc.nextInt();
        sc.nextLine();

        String[] mk = new String[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] bobotNilai = new double[jumlahMK];
        int[] sks = new int[jumlahMK];

        double totalNilai = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));

            System.out.print("Nama MK   : ");
            mk[i] = sc.nextLine();

            System.out.print("Jumlah SKS: ");
            sks[i] = sc.nextInt();

            System.out.print("Nilai Angka: ");
            nilaiAngka[i] = sc.nextDouble();
            sc.nextLine();

            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] >= 75) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] >= 70) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;
            }

            totalNilai += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalNilai / totalSKS;

        System.out.println("\n==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");

        System.out.printf("%-25s %-10s %-12s %-12s %-10s\n",
                "MK", "SKS", "Nilai Angka", "Nilai Huruf", "Bobot");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-25s %-10d %-12.2f %-12s %-10.2f\n",
                    mk[i], sks[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        System.out.println("==============================");
        System.out.printf("Total SKS : %d\n", totalSKS);
        System.out.printf("IP        : %.2f\n", ip);
    }
}
