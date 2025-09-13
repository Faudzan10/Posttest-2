package com.mycompany.reservasi_lapangan_minisoccerr.service;

import com.mycompany.reservasi_lapangan_minisoccerr.model.Reservasi;
import java.util.ArrayList;
import java.util.Scanner;

public class ReservasiService {
    private final ArrayList<Reservasi> daftarReservasi = new ArrayList<>();
    private final Scanner input = new Scanner(System.in);

    // Tambah reservasi dengan validasi input
    public void tambahReservasi() {
        String nama;
        do {
            System.out.print("Nama Pemesan: ");
            nama = input.nextLine().trim();
            if (nama.isEmpty()) System.out.println("Nama tidak boleh kosong!");
        } while (nama.isEmpty());

        String tanggal;
        do {
            System.out.print("Tanggal (dd-mm-yyyy): ");
            tanggal = input.nextLine().trim();
            if (tanggal.isEmpty()) System.out.println("Tanggal tidak boleh kosong!");
        } while (tanggal.isEmpty());

        String jam;
        do {
            System.out.print("Jam (contoh: 18:00): ");
            jam = input.nextLine().trim();
            if (jam.isEmpty()) System.out.println("Jam tidak boleh kosong!");
        } while (jam.isEmpty());

        int durasi = 0;
        while (durasi <= 0) {
            System.out.print("Durasi (jam, minimal 1): ");
            if (input.hasNextInt()) {
                durasi = input.nextInt();
                input.nextLine();
                if (durasi <= 0) System.out.println("Durasi harus lebih dari 0!");
            } else {
                System.out.println("Durasi harus berupa angka!");
                input.nextLine();
            }
        }

        daftarReservasi.add(new Reservasi(nama, tanggal, jam, durasi));
        System.out.println("Reservasi berhasil ditambahkan!");
    }

    // Lihat reservasi
    public void lihatReservasi() {
        if (daftarReservasi.isEmpty()) {
            System.out.println("Belum ada data reservasi.");
        } else {
            System.out.println("\n--- Daftar Reservasi ---");
            for (int i = 0; i < daftarReservasi.size(); i++) {
                System.out.print((i + 1) + ". ");
                daftarReservasi.get(i).infoReservasi();
            }
        }
    }

    // Ubah reservasi per field
    public void ubahReservasi() {
        if (daftarReservasi.isEmpty()) {
            System.out.println("Belum ada data reservasi untuk diubah.");
            return;
        }

        lihatReservasi();
        System.out.print("Masukkan nomor reservasi yang ingin diubah: ");
        int index = input.nextInt();
        input.nextLine();

        if (index > 0 && index <= daftarReservasi.size()) {
            Reservasi r = daftarReservasi.get(index - 1);

            System.out.println("Pilih data yang ingin diubah:");
            System.out.println("1. Nama");
            System.out.println("2. Tanggal");
            System.out.println("3. Jam");
            System.out.println("4. Durasi");
            System.out.print("Pilihan: ");
            int pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1 -> {
                    System.out.print("Nama baru: ");
                    String namaBaru = input.nextLine().trim();
                    if (!namaBaru.isEmpty()) r.setNamaPemesan(namaBaru);
                }
                case 2 -> {
                    System.out.print("Tanggal baru: ");
                    String tanggalBaru = input.nextLine().trim();
                    if (!tanggalBaru.isEmpty()) r.setTanggal(tanggalBaru);
                }
                case 3 -> {
                    System.out.print("Jam baru: ");
                    String jamBaru = input.nextLine().trim();
                    if (!jamBaru.isEmpty()) r.setJam(jamBaru);
                }
                case 4 -> {
                    System.out.print("Durasi baru: ");
                    int durasiBaru = input.nextInt();
                    input.nextLine();
                    if (durasiBaru > 0) r.setDurasi(durasiBaru);
                }
                default -> System.out.println("Pilihan tidak valid!");
            }

            System.out.println("Reservasi berhasil diubah!");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    // Hapus reservasi
    public void hapusReservasi() {
        if (daftarReservasi.isEmpty()) {
            System.out.println("Belum ada data reservasi untuk dihapus.");
            return;
        }

        lihatReservasi();
        System.out.print("Masukkan nomor reservasi yang ingin dihapus: ");
        int index = input.nextInt();
        input.nextLine();

        if (index > 0 && index <= daftarReservasi.size()) {
            daftarReservasi.remove(index - 1);
            System.out.println("Reservasi berhasil dihapus!");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }
}
