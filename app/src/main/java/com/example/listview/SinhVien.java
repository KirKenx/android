package com.example.listview;

public class SinhVien {
    private String ten;
    private int hinh,tuoi;

    public SinhVien(String ten, int tuoi, int hinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
