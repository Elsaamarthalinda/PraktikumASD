package CM2;
public class Pesanan7 {
    int kodePesanan;
    String namaPesanan;
    int harga;
    Pesanan7 prev;
    Pesanan7 next;

    public Pesanan7(int a, String b, int d) {
        this.kodePesanan = a;
        this.namaPesanan = b;
        this.harga = d;   
    }
}