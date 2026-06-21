/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rendi
 */
import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nim = new String[100];
        String[] nama = new String[100];
        String[] prodi = new String[100];

        int jumlahData = 0;
        int pilihan;

        do {
            System.out.println();
            System.out.println("===== MENU =====");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Cari Data Mahasiswa Berdasarkan NIM");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                System.out.println();
                System.out.print("NIM            : ");
                nim[jumlahData] = input.nextLine();

                System.out.print("Nama Mahasiswa : ");
                nama[jumlahData] = input.nextLine();

                System.out.print("Program Studi  : ");
                prodi[jumlahData] = input.nextLine();

                jumlahData++;
                System.out.println("Data berhasil disimpan.");

            } else if (pilihan == 2) {
                System.out.println();
                System.out.println("===== DATA MAHASISWA =====");

                if (jumlahData == 0) {
                    System.out.println("Belum ada data.");
                } else {
                    for (int i = 0; i < jumlahData; i++) {
                        System.out.println("Data ke-" + (i + 1));
                        System.out.println("NIM           : " + nim[i]);
                        System.out.println("Nama          : " + nama[i]);
                        System.out.println("Program Studi : " + prodi[i]);
                        System.out.println();
                    }
                }

            } else if (pilihan == 3) {
                System.out.println();
                System.out.print("Masukkan NIM yang dicari: ");
                String cariNim = input.nextLine();

                boolean ketemu = false;

                for (int i = 0; i < jumlahData; i++) {
                    if (nim[i].equals(cariNim)) {
                        System.out.println();
                        System.out.println("Data ditemukan");
                        System.out.println("NIM           : " + nim[i]);
                        System.out.println("Nama          : " + nama[i]);
                        System.out.println("Program Studi : " + prodi[i]);
                        ketemu = true;
                        break;
                    }
                }

                if (!ketemu) {
                    System.out.println("Data dengan NIM tersebut tidak ditemukan.");
                }

            } else if (pilihan == 4) {
                System.out.println("Program selesai.");

            } else {
                System.out.println("Pilihan menu tidak tersedia.");
            }

        } while (pilihan != 4);
    }
}
