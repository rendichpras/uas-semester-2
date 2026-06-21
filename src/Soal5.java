/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rendi
 */
import java.util.Scanner;

public class Soal5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Pelanggan : ");
        String nama = input.nextLine();

        System.out.print("Tipe Kamar     : ");
        String tipe = input.nextLine();

        System.out.print("Lama Menginap  : ");
        int lama = input.nextInt();

        int hargaPerMalam = 0;

        if (tipe.equalsIgnoreCase("Standard")) {
            hargaPerMalam = 300000;
        } else if (tipe.equalsIgnoreCase("Deluxe")) {
            hargaPerMalam = 500000;
        } else if (tipe.equalsIgnoreCase("Suite")) {
            hargaPerMalam = 800000;
        } else {
            System.out.println("Tipe kamar tidak tersedia.");
            return;
        }

        int totalBiaya = hargaPerMalam * lama;
        double persenDiskon;

        if (lama > 5) {
            persenDiskon = 0.20;
        } else if (lama >= 3) {
            persenDiskon = 0.10;
        } else {
            persenDiskon = 0;
        }

        double potongan = totalBiaya * persenDiskon;
        double totalBayar = totalBiaya - potongan;

        System.out.println();
        System.out.println("===== STRUK RESERVASI =====");
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Tipe Kamar     : " + tipe);
        System.out.println("Lama Menginap  : " + lama + " malam");
        System.out.println("Total Biaya    : Rp " + totalBiaya);
        System.out.println("Diskon         : Rp " + potongan);
        System.out.println("Total Bayar    : Rp " + totalBayar);
    }
}
