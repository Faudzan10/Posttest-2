package com.mycompany.reservasi_lapangan_minisoccerr.main;

import com.mycompany.reservasi_lapangan_minisoccerr.service.ReservasiService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ReservasiService service = new ReservasiService();

        while (true) {
            System.out.println("\n=== SISTEM RESERVASI LAPANGAN ZANOD MINI SOCCER ===");
            System.out.println("1. Tambah Reservasi");
            System.out.println("2. Lihat Reservasi");
            System.out.println("3. Ubah Reservasi");
            System.out.println("4. Hapus Reservasi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1 -> service.tambahReservasi();
                case 2 -> service.lihatReservasi();
                case 3 -> service.ubahReservasi();
                case 4 -> service.hapusReservasi();
                case 5 -> {
                    System.out.println("Terima kasih! Program selesai.");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
