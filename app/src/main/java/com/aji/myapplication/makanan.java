package com.aji.myapplication;

public class makanan {

    private  String nama, diskripsi, harga;
    private int id_gambar;


    public makanan(String nama, String diskripsi, String harga, int id_gambar) {
        this.nama = nama;
        this.diskripsi = diskripsi;
        this.harga = harga;
        this.id_gambar = id_gambar;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDiskripsi() {
        return diskripsi;
    }

    public void setDiskripsi(String diskripsi) {
        this.diskripsi = diskripsi;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getId_gambar() {
        return id_gambar;
    }

    public void setId_gambar(int id_gambar) {
        this.id_gambar = id_gambar;
    }
}
