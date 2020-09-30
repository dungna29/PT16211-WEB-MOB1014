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
public class S8_If_Else {

    public static void main(String[] args) {
        final String ID = "admin";
        final String PASS = "123";
        Scanner sc = new Scanner(System.in);
        String id, pass;
        System.out.println("Chương trình đăng nhập vào POLY");
        System.out.println("ID: ");
        id = sc.nextLine();
        System.out.println("PASS: ");
        pass = sc.nextLine();
        //Đây là cách Login bằng toán tử 3 ngôi
//        String kq = id.equals(ID) && pass.equals(PASS) ? "Chúc mừng bạn login thành công" : "Login thất bại";
//        String kq1 = (5 == 5) && (3 == 3)? "Chúc mừng bạn login thành công" : "Login thất bại";
//        System.out.println(kq);
//        System.out.println(kq1);
        //IF là câu điều kiện luôn đúng
//        if (id.equals(ID) && pass.equals(PASS)) {
//            System.out.println("Chúc mừng bạn login thành công");
//        }
//        if (!(id.equals(ID) && pass.equals(PASS))) {
//            System.out.println("Chúc mừng bạn thất bại");
//        }
//        
//        if (false) {
//           //Không bao giờ chạy vào nếu đầu vào của IF là false
//        }

        //If Else - Nếu không true ở If thì sẽ vào Else
        // Chỉ có thể thỏa mãn 1 trong các trường hợp trong IF và ELSE
        if (true) {
            //Để vào được bên trong của IF thì biểu thức phải luôn đúng
        } else {
            // Ngược lại giá trị của biểu thức IF
        }
        if (id.equals(ID) && pass.equals(PASS)) {
            System.out.println("Chúc mừng bạn login thành công");
        } else {
            System.out.println("Chúc mừng bạn thất bại");
        }

        //Else If
        if (true) {
            //Chỉ vào đây khi biểu thức đúng
        } else if (true) {
            //Nếu If ở trên không đúng thì mới vào đây và cũng phải thỏa mãn điều kiện
        } else if (true) {
            //Nếu else if ở trên không đúng thì mới vào đây và cũng phải thỏa mãn điều kiện
        } else {
            //Ngược lại với tất cả các trường hợp trên.
        }

    }
}
