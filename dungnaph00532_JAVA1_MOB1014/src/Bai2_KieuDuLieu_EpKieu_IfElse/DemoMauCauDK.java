/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2_KieuDuLieu_EpKieu_IfElse;

import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class DemoMauCauDK {

    public static void main(String[] args) {
        //Bài tập: Nhập điểm JAVA1 vào để tính điểm có qua môn hay không?
        //Lớn hơn hoặc bằng 5 thì sẽ qua môn
        Scanner sc = new Scanner(System.in);
        float diem;
        System.out.println("Mời bạn nhập điểm GPA JAVA1: ");
        diem = Float.parseFloat(sc.nextLine());//Ép kiểu từ String về Float
//        if (diem >= 5) {
//            System.out.println("Chúc mừng bạn đã qua môn");
//        } else {
//            System.out.println("Chúc mừng bạn đã mất 600K");
//        }
//        if (diem >= 5) {
//            System.out.println("Chúc mừng bạn đã qua môn");
//        }
//        if (diem < 5) {
//              System.out.println("Chúc mừng bạn đã mất 600K");
//        }
        // Xếp loại điểm trung bình JAVA1 dùng Else If
        // Nếu điểm nhỏ hơn 2 điểm thì bạn nên học lại 2 lần JAVA1
        // Nếu điểm nhỏ hơn 5 điểm thì bạn nên học lại 1 lần JAVA1
        // Nếu điểm nhỏ hơn 8 và lớn hơn 5 thì bạn nên Học JAVA2
        //Bài tóa này chưa chính xác ở nhiều điều kiện cần phải tham khảo thêm các trường hợp
//        if (diem < 2) {
//            System.out.println("Mời bạn học lại 2 lần JAVA1");
//        }
//        if (diem < 5 && diem >= 2) {
//            System.out.println("Mời bạn học lại 1 lần JAVA1");
//        }
//        if (diem < 8 && diem > 5) {
//            System.out.println("Mời bạn nên học JAVA2");
//        }
        //Cách này vẫn đúng nhưng code Logic chưa tốt
//        if (diem <= 2 && diem < 0) {
//            System.out.println("Mời bạn học lại 2 lần JAVA1");
//        } else if (diem < 5 && diem > 2 && diem < 0) {
//            System.out.println("Mời bạn học lại 1 lần JAVA1");
//        } else {
//            System.out.println("Mời bạn nên học JAVA2");
//        }
        if (diem >= 0) {
            if (diem <= 2) {
                System.out.println("Mời bạn học lại 2 lần JAVA1");
            } else if (diem < 5 && diem > 2) {
                System.out.println("Mời bạn học lại 1 lần JAVA1");
            } else {
                System.out.println("Mời bạn nên học JAVA2");
            }
        } else {
            System.out.println("Mời bạn nhập điểm không âm");
        }

    }
}
