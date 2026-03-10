package BruteForceDivideConquer.minggu5;

public class NilaiMahasiswa7 {
    public static Mahasiswa7 utsTertinggi(Mahasiswa7[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l];
        }
        int mid = (l + r) / 2;

        Mahasiswa7 kiri = utsTertinggi(mhs, l, mid);
        Mahasiswa7 kanan = utsTertinggi(mhs, mid + 1, r);

        if (kiri.nilaiUTS > kanan.nilaiUTS) {
            return kiri;
        } else {
            return kanan;
        }
    }

    public static Mahasiswa7 utsTerendah(Mahasiswa7[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l];
        }
        int mid = (l + r) / 2;

        Mahasiswa7 kiri = utsTerendah(mhs, l, mid);
        Mahasiswa7 kanan = utsTerendah(mhs, mid + 1, r);

        if (kiri.nilaiUTS < kanan.nilaiUTS) {
            return kiri;
        } else {
            return kanan;
        }
    }

    public static double rataUAS(Mahasiswa7[] mhs) {
        double total = 0;

        for (int i = 0; i < mhs.length; i++) {
            total += mhs[i].nilaiUAS;
        }
        return (double) total / mhs.length;
    }
}