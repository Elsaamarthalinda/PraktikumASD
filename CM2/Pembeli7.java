package CM2;
public class Pembeli7 {
    int noAntrian;
    String namaPembeli;
    String noHp;
    Pembeli7 prev;
    Pembeli7 next;

    public Pembeli7(int noAntrian, String b, String c) {
        this.noAntrian = noAntrian;
        this.namaPembeli = b;
        this.noHp = c;  
    }
} 