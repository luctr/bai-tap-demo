package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {

    private final static Manager INSTANCE = new Manager();

    private List<TheMuon> theMuons = new ArrayList<>();

    private Manager() {

    }

    public static Manager getInstance() {
        return INSTANCE;
    }

    public void themThe() {
        Scanner scanner = new Scanner(System.in);
        TheMuon theMuon = new TheMuon();
        System.out.print("Nhap so phieu muon: ");
        theMuon.setSoPhieuMuon(scanner.nextLine());
        System.out.print("Nhap ngay muon: ");
        theMuon.setNgayMuon(scanner.nextLine());
        System.out.print("Nhap ngay tra: ");
        theMuon.setHanTra(scanner.nextLine());
        System.out.print("Nhap so hieu sach: ");
        theMuon.setSoHieuSach(scanner.nextLine());
        theMuon.setSinhViens(new ArrayList<>());
        theMuons.add(theMuon);
    }

    public void xoaTheMuon(int index) {
        theMuons.remove(index);
    }

    public void themSinhVienMuonThe(TheMuon theMuon) {
        Scanner scanner = new Scanner(System.in);
        SinhVien sinhVien = new SinhVien();
        System.out.print("Nhap ten sinh vien: ");
        sinhVien.setHoTen(scanner.nextLine());
        System.out.print("Nhap ma sinh vien: ");
        sinhVien.setMaSinhVien(scanner.nextLine());
        System.out.print("Nhap ngay sinh: ");
        sinhVien.setNgaySinh(scanner.nextLine());
        System.out.print("Nhap lop: ");
        sinhVien.setLop(scanner.nextLine());
        theMuon.getSinhViens().add(sinhVien);
    }

    public TheMuon timTheMuonTheoSoHieuSach(String soHieuSach) {
        for(TheMuon theMuon : theMuons) {
            if(theMuon.getSoHieuSach().equals(soHieuSach)) {
                return theMuon;
            }
        }
        return null;
    }

    public SinhVien timSinhVienTheoMaSinhVien(List<SinhVien> sinhViens, String maSV) {
        for(SinhVien sinhVien : sinhViens) {
            if(sinhVien.getMaSinhVien().equals(maSV)) {
                return sinhVien;
            }
        }
        return null;
    }

    public List<TheMuon> getTheMuons() {
        return theMuons;
    }

    public void setTheMuons(List<TheMuon> theMuons) {
        this.theMuons = theMuons;
    }

}
