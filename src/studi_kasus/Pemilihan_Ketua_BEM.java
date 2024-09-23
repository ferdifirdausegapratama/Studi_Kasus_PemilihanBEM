package studi_kasus;

/**
 *
 * @author Ferdi Firdaus
 */
//PemilihanKetuaBEM
public class Pemilihan_Ketua_BEM {
    //Untuk menyimpan jumlah pemilih total
    private static int jumlahPemilihTotal = 0;

    //Untuk menyimpan periode pemilihan
    private final String periodePemilihan;

    //Untuk menyimpan jumlah suara untuk setiap kandidat
    private int suaraKandidat1;
    private int suaraKandidat2;

    //Untuk inisialisasi pemilihan ketua BEM
    public Pemilihan_Ketua_BEM(String periodePemilihan) {
        this.periodePemilihan = periodePemilihan;
    }

    //Untuk memilih kandidat 1
    public void pilihKandidat1() {
        suaraKandidat1++;
        jumlahPemilihTotal++;
    }

    //Untuk memilih kandidat 2
    public void pilihKandidat2() {
        suaraKandidat2++;
        jumlahPemilihTotal++;
    }

    //Untuk menampilkan hasil pemilihan
    public void tampilkanHasilPemilihan() {
        System.out.println("Hasil pemilihan ketua BEM periode " + periodePemilihan + ":");
        System.out.println("Jumlah pemilih: " + jumlahPemilihTotal);
        System.out.println("Suara kandidat 1: " + suaraKandidat1);
        System.out.println("Suara kandidat 2: " + suaraKandidat2);
        if (suaraKandidat1 > suaraKandidat2) {
            System.out.println("Kandidat 1 terpilih sebagai ketua BEM.");
        } else if (suaraKandidat2 > suaraKandidat1) {
            System.out.println("Kandidat 2 terpilih sebagai ketua BEM.");
        } else {
            System.out.println("Pemilihan berakhir imbang.");
        }
    }
}
