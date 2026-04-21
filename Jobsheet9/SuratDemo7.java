package Jobsheet9;
import java.util.Scanner;

public class SuratDemo7 {
    public static void main(String[] args) {
        StackSurat7 stack = new StackSurat7(5);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine().trim();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();
                    stack.push(new Surat7(id, nama, kelas, jenis, durasi));
                    break;
                case 2:
                    Surat7 s = stack.pop();
                    if (s != null) {
                        System.out.println("Memproses surat dari " + s.namaMahasiswa);
                    }
                    break;
                case 3:
                    Surat7 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dari " + lihat.namaMahasiswa);
                    } else {
                        System.out.println("Tidak ada surat dalam stack");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama: ");
                    String cari = sc.nextLine().trim();
                    if (stack.cariSurat(cari)) {
                        System.out.println("Surat ditemukan");
                    } else {
                        System.out.println("Surat Tidak ditemukan");
                    }
                    break;
            }
        } while (pilih != 0);
    }
}