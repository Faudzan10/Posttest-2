package com.mycompany.reservasi_lapangan_minisoccerr.model;

public class Reservasi {
    private String namaPemesan;
    private String tanggal;
    private String jam;
    private int durasi;

    // Constructor
    public Reservasi(String namaPemesan, String tanggal, String jam, int durasi) {
        this.namaPemesan = namaPemesan;
        this.tanggal = tanggal;
        this.jam = jam;
        this.durasi = durasi;
    }

    // Getter & Setter
    public String getNamaPemesan() {
        return namaPemesan;
    }

    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    // Info Reservasi
    public void infoReservasi() {
        System.out.println(namaPemesan + " - " + tanggal + " " + jam + " (" + durasi + " jam)");
    }
}
