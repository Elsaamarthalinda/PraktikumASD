package Pertemuan11;
public class SLLMain7 {
    public static void main(String[] args) {
        SingleLinkedList7 sll = new SingleLinkedList7();

        Mahasiswa7 mhs1 = new Mahasiswa7("24212200", "Alvaro","1A", 4.0);
        Mahasiswa7 mhs2 = new Mahasiswa7("23212201", "Bimon","2B", 3.8);
        Mahasiswa7 mhs3 = new Mahasiswa7("22212202", "Cintia","3C", 3.5);
        Mahasiswa7 mhs4 = new Mahasiswa7("21212203", "Dirga","4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}