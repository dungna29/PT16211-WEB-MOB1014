/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author LegendNguyen
 */
public class S3_KhaiNiemBien {

    //Alt + Shift + F Dùng để format code
    //Biến đặt ngoài hàm được gọi là biến toàn cục và được gọi đến đối với các hàm bên trong class
    static int b = 9;

    public static void main(String[] args) {
        //Biến đặt ở trong 1 hàm được gọi là biến cục bộ
        int a;//Khởi tạo 1 biến a có kiểu dữ liệu là số nguyên và không có giá trị khởi tạo
        
        //Yêu cầu tạo 5 biến để lưu trữ kiểu số nguyên
        //Nếu khai báo như dưới đây không sai mà là quá sai
        int a1;
        int a2;
        int a3;
        int a4;
        int a5;
        
        
        //int là số nguyên
        //String là kiểu chuỗi
        //double số thực
        //char ký tự
    }

    static void GoiBien() {
        //Các bạn có thể tái sử dụng ở các hàm khác nhau mà không cần khai báo lại
        System.out.println(b);
    }

    static void GoiBien2() {
        System.out.println(b);
    }
}
