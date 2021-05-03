package com;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String FILE_PATH = "data.dat";

    public static void main(String[] args) {
        Manager manager = Manager.getInstance();
        Scanner scanner = new Scanner(System.in);
        List<TheMuon> theMuons = (List) FileUtils.readFile(FILE_PATH);
        manager.setTheMuons(theMuons);
        do {
            System.out.println("----------------------MENU----------------------------");
            System.out.println("1. Them the muon");
            System.out.println("2. Them sv muon the");
            System.out.println("3. Hien thi");
            System.out.print("Chon: ");
            int luaChon = scanner.nextInt();
            scanner.nextLine();
            switch (luaChon) {
                case 1:
                    manager.themThe();
                    FileUtils.writeFile(FILE_PATH, manager.getTheMuons());
                    break;
                case 2:
                    System.out.print("Nhap so hieu sach can muon: ");
                    String soHieuSach = scanner.nextLine();
                    TheMuon theMuon = manager.timTheMuonTheoSoHieuSach(soHieuSach);
                    if (theMuon == null) {
                        System.out.println("Khong tim thay the");
                    } else {
                        manager.themSinhVienMuonThe(theMuon);
                    }
                    FileUtils.writeFile(FILE_PATH, manager.getTheMuons());
                    break;
                case 3:
                    for (int i = 0; i < manager.getTheMuons().size(); i++) {
                        System.out.println(manager.getTheMuons().get(i));
                    }
                    break;
            }
        } while (true);

    }

}
