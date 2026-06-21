/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rendi
 */
import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Nilai Tugas    : ");
        double tugas = input.nextDouble();

        System.out.print("Nilai Kuis     : ");
        double kuis = input.nextDouble();

        System.out.print("Nilai UTS      : ");
        double uts = input.nextDouble();

        System.out.print("Nilai UAS      : ");
        double uas = input.nextDouble();

        double nilaiAkhir = (tugas * 0.20) + (kuis * 0.15) + (uts * 0.30) + (uas * 0.35);

        char grade;
        if (nilaiAkhir >= 85) {
            grade = 'A';
        } else if (nilaiAkhir >= 70) {
            grade = 'B';
        } else if (nilaiAkhir >= 55) {
            grade = 'C';
        } else if (nilaiAkhir >= 40) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println();
        System.out.println("===== HASIL NILAI =====");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nilai Akhir    : " + nilaiAkhir);
        System.out.println("Grade          : " + grade);
    }
}
