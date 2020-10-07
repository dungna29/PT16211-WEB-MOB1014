/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5_OOP_Ham;

import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class S3_BaiMauDoiTuong_Mang_CachGiai2 {

    static GiaoVien[] arrGiaoVien;
    static GiaoVien gv;
    static int input;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Số lượng giáo viên muốn thêm: ");
        input = Integer.parseInt(sc.nextLine());
        inputGiaoVien(input);
        if (arrGiaoVien.length >0) {
            outputGiaoVien(arrGiaoVien);
        }
        
    }

    static void inputGiaoVien(int sizeMang) {
        arrGiaoVien = new GiaoVien[sizeMang];
        for (int i = 0; i < sizeMang; i++) {
            gv = new GiaoVien();//Khởi tạo ra 1 đối tượng giáo viên mới
            System.out.println("Mời bạn nhập tên GV " + i);
            // arrGiaoVien[i].setName(sc.nextLine()); có nghĩa là gọi đến đối tượng tại vị trí thứ i để set giá trị cho từng thuộc tính
            gv.setName(sc.nextLine());//Hành động set thuộc tính cho đối tượng
            System.out.println("Mời bạn nhập sdt GV " + i);
            gv.setSdt(sc.nextLine());
            arrGiaoVien[i] = gv;//Gán đối tượng tại vị trí thứ i trong mảng bằng 1 đối tượng có cùng kiểu
        }
    }

   static void outputGiaoVien(GiaoVien[] arrGiaoVien1) {
        //In tất cả các đối tượng ra màn hình
        for (GiaoVien x : arrGiaoVien1) {
            //x là tên biến có kiểu dữ liệu là đối tượng GIÁO VIÊN
            x.inRaHinh();//Gọi đến hàm in thuộc tính của đối tượng ra màn hình
        }
    }
}
