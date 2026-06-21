/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rendi
 */
import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilai = new int[10];
        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        double rataRata = total / 10.0;

        System.out.println();
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah  : " + terendah);
        System.out.println("Rata-rata       : " + rataRata);

        System.out.println();
        System.out.println("Nilai di atas rata-rata:");
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > rataRata) {
                System.out.println(nilai[i]);
            }
        }
    }
}
