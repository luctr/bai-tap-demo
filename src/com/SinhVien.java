package com;

import java.io.Serializable;
import java.util.Date;

public class SinhVien implements Serializable {

    private static final long serialVersionUID = 1L;

    private String hoTen;
    private String maSinhVien;
    private String ngaySinh;
    private String lop;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", maSinhVien='" + maSinhVien + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", lop='" + lop + '\'' +
                '}';
    }
}
