/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1_LamQuenJava_KhaiBaoBien;

import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class DemoNhapXuatDuLieu {

    public static void main(String[] args) {
        //Đầu bài mời người dùng nhập vào tên của họ và in ra màn hình
        String name;//Bước 1 khởi tạo 1 biến để lưu tên khi người dùng nhập vào
        Scanner sc = new Scanner(System.in);//Bước 2Gọi ra 1 lớp dùng để đọc dữ liệu từ bàn phím vào chương trình
        //Bước 3 In ra màn hình 1 câu thông báo mời người dùng nhập vào
        System.out.print("Mời bạn nhập tên của bạn vào nhé : ");
        //Bước 4 Gọi hàm sc.nextline() để gán giá trị cho biến name
        name = sc.nextLine();//Dùng để đọc 1 chuỗi ký tự từ bàn nhập vào
        //Bước 5 In giá trị của biến name ra màn hình
        System.out.printf("Chào mừng bạn %s học lại",name);
    }
}
