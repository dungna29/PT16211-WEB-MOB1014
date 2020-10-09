/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7_DemoAssignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class Main_Cach2 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<GiaoVien> arrListGiaoVien = new ArrayList<>();//Khai báo danh sách kiểu biến toàn cục ở bên ngoài và chỉ làm việc với danh sách này

    public static void main(String[] args) {
        swtichCaseGV();
    }

    static void swtichCaseGV() {
        String input = "";
        do {
            menu();
            System.out.print("Mời bạn chọn chức năng: ");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    //Khi chọn 1 thêm sẽ có 2 cách thêm đối tượng giáo viên
                    //1. Thêm mặc định 3 phần tử
                    //2. Thêm từng phần tử
                    String input2 = "";
                    System.out.println("1. Tạo ra 3 đối tượng giáo viên ảo");
                    System.out.println("2. Thêm từng đối tượng giáo viên");
                    System.out.print("Mời bạn chọn: ");
                    input2 = sc.nextLine();
                    switch (input2) {
                        case "1":
                            them3DoiTuongGV();
                            break;
                        case "2":
                            them1DoiTuongGV();
                            break;
                        default:
                    }
                    break;
                case "2":
                    suaGV();
                    break;
                case "3":
                    xoaGV();
                    break;
                case "4":
                    timkiemGV();
                    break;
                case "5":
                    xuatDsGV();
                    break;
                default:
                    System.out.println("Chức năng bạn chọn không tồn tại mời chọn lại");
            }
        } while (true);
    }

    static void menu() {
        System.out.println("1. Thêm mới");
        System.out.println("2. Sửa");
        System.out.println("3. Xóa");
        System.out.println("4. Tìm kiếm");
        System.out.println("5. Xuất ds");
    }

    static void them3DoiTuongGV() {
        //Tạo ra 3 phần tử mặc định cho chương trình
        //Cách 1: sử dụng contructor có tham số truyền vào        
        GiaoVien gv1 = new GiaoVien("Dungna", 1999, "13234516");
        GiaoVien gv2 = new GiaoVien("ThienTH", 2000, "13234516");
        GiaoVien gv3 = new GiaoVien("MinhDQ", 20001, "13234561");
        //Cách 2: Sử dụng contructor không số truyền vào?????
        GiaoVien gv4 = new GiaoVien();
        gv4.setMaGV("TienNH");
        gv4.setNamsinh(1995);
        gv4.setSdt("1234668");
        //Thực hiện thêm đối tượng vào danh sách
        arrListGiaoVien.add(gv1);
        arrListGiaoVien.add(gv2);
        arrListGiaoVien.add(gv3);
        arrListGiaoVien.add(gv4);
        System.out.println("Bạn đã tạo thành công 4 đối tượng ảo");
    }

    static void them1DoiTuongGV() {

    }

    static void suaGV() {
        String input;
        System.out.print("Mời nhập mã muốn Giáo Viên muốn sửa: ");
        input = sc.nextLine();
        int temp = getIndexGiaoVien(input);
        System.out.println("Mời bạn sửa số điện thoại : ");
        arrListGiaoVien.get(temp).setSdt(sc.nextLine());
        System.out.println("Mời bạn sửa năm sinh : ");
        arrListGiaoVien.get(temp).setNamsinh(Integer.parseInt(sc.nextLine()));
        System.out.println("Sửa thành công");
    }

    static void xoaGV() {
        String input;
        System.out.print("Mời nhập mã muốn Giáo Viên muốn xóa: ");
        input = sc.nextLine();
        arrListGiaoVien.remove(getIndexGiaoVien(input));
        System.out.println("Xóa thành công");

    }

    static void timkiemGV() {
        String input;
        System.out.print("Mời nhập mã muốn Giáo Viên muốn tìm kiếm: ");
        input = sc.nextLine();
        System.out.println(arrListGiaoVien.get(getIndexGiaoVien(input)).toString());
        System.out.println("----------------------");

    }

    static void xuatDsGV() {
        if (arrListGiaoVien.isEmpty()) {
            System.out.println("Danh sách Giáo Viên đang không có dữ liệu");
            return;//Nếu vào đây code sẽ ko chạy xuống dưới
        }
        for (GiaoVien x : arrListGiaoVien) {
            System.out.println(x.toString());
        }
    }

    static int getIndexGiaoVien(String maGV) {
        for (int i = 0; i < arrListGiaoVien.size(); i++) {
            if (maGV.equalsIgnoreCase(arrListGiaoVien.get(i).getMaGV())) {
                return i;
            }
        }
        return -1;
    }
}
