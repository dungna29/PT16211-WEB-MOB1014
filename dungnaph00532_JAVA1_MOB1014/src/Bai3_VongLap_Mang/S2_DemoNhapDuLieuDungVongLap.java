/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3_VongLap_Mang;

import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class S2_DemoNhapDuLieuDungVongLap {

    public static void main(String[] args) {
        //Viết 1 chương trình cho phép nhập điểm thi JAVA và báo kết quả
        Scanner sc = new Scanner(System.in);
        double diemThiJava;
        String input;
        while (true) {
            System.out.print("Mời bạn nhập điểm thi JAVA1: ");
            diemThiJava = Double.parseDouble(sc.nextLine());
            if (diemThiJava >= 5) {
                System.out.println("Chúc mừng bạn qua môn");
            } else {
                System.out.println("Chúc mừng bạn học lại");
            }
            //Hỏi người dùng có muốn dừng hay không
            System.out.println("Bạn có muốn nhập tiếp ko? bấm Y hoặc N");
            input = sc.nextLine();
            
            //Muốn người dùng phải nhập Y hoặc N thì mới cho đi tiếp còn không
            //sẽ bắt người dùng nhập lại cho đến khi đúng thì thôi
            while (!(input.equals("Y") || input.equals("N"))) {
                System.out.println("Bạn có muốn nhập tiếp ko? bấm Y hoặc N");
                input = sc.nextLine();
                System.out.println("Mời bạn chọn lại Y hoặc N");
            }
//            do {
//                System.out.println("Bạn có muốn nhập tiếp ko? bấm Y hoặc N");
//                input = sc.nextLine();
//                System.out.println("Mời bạn chọn Y hoặc N");
//            } while (!(input.equals("Y") || input.equals("N")));

            if (input.equals("Y")) {
                System.out.println("Bạn đã chọn Y");
                continue;//Nếu vào continue nó sẽ quay trở lại đầu của vòng lặp và ko chạy xuống dưới
            } else if (input.equals("N")) {
                System.out.println("Bạn đã chọn N");
                break;//Dừng vòng lặp
            } else {

            }

        }
    }
}
