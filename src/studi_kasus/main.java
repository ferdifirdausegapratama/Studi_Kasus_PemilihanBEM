/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studi_kasus;

/**
 *
 * @author Ferdi Firdaus
 */
// Main.java
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Objek pemilihan ketua BEM
        Pemilihan_Ketua_BEM pemilihanKetuaBEM = new Pemilihan_Ketua_BEM("2024-2025");

        //Menampilkan opsi pemilihan kandidat
        Pilihan_Kandidat.tampilkanOpsi();

        //Input dari pemilih
        System.out.print("Masukkan pilihan Anda (1/2): ");
        int pilihan = scanner.nextInt();

        //Memproses pilihan pemilih
        switch (pilihan) {
            case 1:
                pemilihanKetuaBEM.pilihKandidat1();
                break;
            case 2:
                pemilihanKetuaBEM.pilihKandidat2();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        //Menampilkan hasil pemilihan
        System.out.println();
        pemilihanKetuaBEM.tampilkanHasilPemilihan();

        scanner.close();
    }
}
