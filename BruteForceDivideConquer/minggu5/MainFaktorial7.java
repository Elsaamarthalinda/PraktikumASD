package BruteForceDivideConquer.minggu5;
import java.util.Scanner;
public class MainFaktorial7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

    Faktorial7 fk = new Faktorial7();
    System.out.println("Nilai faktorial "+nilai+ " menggunakan BF: "+fk.faktorialBF(nilai));
    System.out.println("Nilai faktorial "+nilai+ " menggunakan DC: "+fk.faktorialDC(nilai));
    }
}