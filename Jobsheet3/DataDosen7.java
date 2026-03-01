package Jobsheet3;

public class DataDosen7 {
    void dataSemuaDosen7(Dosen7[] arrayOfDosen7) {
        for(int i=0; i<arrayOfDosen7.length;i++) {
            System.out.println("Data Dosen ke-" +(i+1));
            arrayOfDosen7[i].cetakInfo();
            System.out.println("--------------------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen7[] arrayOfDosen7){
        int pria = 0;
        int wanita = 0;
        for(int i=0; i<arrayOfDosen7.length; i++) {
            if (arrayOfDosen7[i].jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria adalah: " +pria);
        System.out.println("Jumlah Dosen Wanita adalah: " +wanita) ;
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen7[] arrayOfDosen7) {
        int totalPria=0, totalWanita=0;
        int jumlahPria=0, jumlahWanita=0;

        for(int i=0; i<arrayOfDosen7.length;i++) {
            if (arrayOfDosen7[i].jenisKelamin) {
                totalPria += arrayOfDosen7[i].usia;
                jumlahPria++;
            } else {
                totalWanita += arrayOfDosen7[i].usia;
                jumlahWanita++;
            }
        }

        if (jumlahPria>0) {
            System.out.println("Rata-Rata usia dosen pria:" +(totalPria/jumlahPria));
        }

        if (jumlahWanita>0) {
            System.out.println("Rata-Rata usia dosen wanita adalah: " +(totalWanita/jumlahWanita));
        }
    }

    void infoDosenPalingTua (Dosen7[] arrayOfDosen7) {
        int idxTertua = 0;

        for(int i =0; i<arrayOfDosen7.length; i++) {
            if(arrayOfDosen7[i].usia > arrayOfDosen7[idxTertua].usia) {
                idxTertua=i;
            }
        }

        System.out.println("Dosen paling tua: ");
        arrayOfDosen7[idxTertua].cetakInfo();

    }

    void infoDosenPalingMuda (Dosen7[] arrayOfDosen7) {
        int idxTermuda = 0;

        for(int i =0; i<arrayOfDosen7.length; i++) {
            if(arrayOfDosen7[i].usia<arrayOfDosen7[idxTermuda].usia) {
                idxTermuda=i;
            }
        }

        System.out.println("Dosen paling muda: ");
        arrayOfDosen7[idxTermuda].cetakInfo();
    }
}
