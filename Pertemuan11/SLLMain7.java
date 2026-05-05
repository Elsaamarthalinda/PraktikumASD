package Pertemuan11;
import java.util.Scanner;
public class SLLMain7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList7 sll = new SingleLinkedList7();

        System.out.print("Masukkan jumlah data: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            System.out.print("NIM\t: ");
            String nim = sc.nextLine();

            System.out.print("Nama\t: ");
            String nama = sc.nextLine();

            System.out.print("Kelas\t: ");
            String kelas = sc.nextLine();

            System.out.print("IPK\t: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa7 mhs = new Mahasiswa7(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }
    }
}