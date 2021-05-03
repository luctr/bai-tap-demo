package com;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TheMuon implements Serializable {

    private static final long serialVersionUID = 1L;


    private String soPhieuMuon;
    private String ngayMuon;
    private String hanTra;
    private String soHieuSach;

    private List<SinhVien> sinhViens;

    public String getSoPhieuMuon() {
        return soPhieuMuon;
    }

    public void setSoPhieuMuon(String soPhieuMuon) {
        this.soPhieuMuon = soPhieuMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getHanTra() {
        return hanTra;
    }

    public void setHanTra(String hanTra) {
        this.hanTra = hanTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    public List<SinhVien> getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(List<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }

    @Override
    public String toString() {
        return "TheMuon{" +
                "soPhieuMuon='" + soPhieuMuon + '\'' +
                ", ngayMuon='" + ngayMuon + '\'' +
                ", hanTra='" + hanTra + '\'' +
                ", soHieuSach='" + soHieuSach + '\'' +
                ", sinhViens=" + sinhViens +
                '}';
    }
}
