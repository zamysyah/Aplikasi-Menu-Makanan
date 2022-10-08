package com.almas27.aplikasimenumakanan;

public class Kuliner {
    private String nama, deskripsi, harga;
    private int imgFoto;

    public Kuliner(String nama, String harga, String deskripsi, int imgFoto) {
        this.nama = nama;
        this.harga = harga;
        this.deskripsi = deskripsi;
        this.imgFoto = imgFoto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getImgFoto() {
        return imgFoto;
    }

    public void setImgFoto(int imgFoto) {
        this.imgFoto = imgFoto;
    }
}