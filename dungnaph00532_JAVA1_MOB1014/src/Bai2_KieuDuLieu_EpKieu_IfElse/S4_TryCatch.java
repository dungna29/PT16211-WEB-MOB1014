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
public class S4_TryCatch {

    public static void main(String[] args) {

        try {
            //Thực hiện 1 công việc nào đó ở bên trọng
        } catch (Exception e) {
            //Khi công việc đó xảy ra lỗi thì sẽ xuống catch
            //Xuống catch thì bạn cũng thể thực hiện 1 công việc nào đấy
        }

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời bạn nhập vào kiểu số nguyên :");
            long a = Long.parseLong(sc.nextLine());
            System.out.println(a);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Bạn nhập không đúng kiểu số nguyên");
        }

     
      

    }
}
