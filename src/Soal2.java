/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rendi
 */
import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Barang : ");
        String namaBarang = input.nextLine();

        System.out.print("Harga Barang: ");
        int harga = input.nextInt();

        System.out.print("Jumlah Beli : ");
        int jumlah = input.nextInt();

        int totalBelanja = harga * jumlah;
        double persenDiskon;

        if (totalBelanja >= 500000) {
            persenDiskon = 0.15;
        } else if (totalBelanja >= 250000) {
            persenDiskon = 0.10;
        } else {
            persenDiskon = 0;
        }

        double potongan = totalBelanja * persenDiskon;
        double totalBayar = totalBelanja - potongan;

        System.out.println();
        System.out.println("===== STRUK PEMBELIAN =====");
        System.out.println("Nama Barang    : " + namaBarang);
        System.out.println("Harga Barang   : Rp " + harga);
        System.out.println("Jumlah Beli    : " + jumlah);
        System.out.println("Total Belanja  : Rp " + totalBelanja);
        System.out.println("Potongan Diskon: Rp " + potongan);
        System.out.println("Total Bayar    : Rp " + totalBayar);
    }
}
