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
public class S3_EpKieu {

    public static void main(String[] args) {
        String a = "5", b = "3";
        System.out.println(a + b);// Kếy quả 53 vì đây là hành động cộng chuỗi
        System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
        //Integer.parseInt(a) dùng để ép kiểu từ chuỗi về sô và ở đây là ép về số nguyên
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số thứ 1: ");
        a = sc.nextLine();
        System.out.println("Mời bạn nhập số thứ 2: ");
        b = sc.nextLine();
        System.out.printf("Kết quả %s + %s = %d", a, b, Integer.parseInt(a) + Integer.parseInt(b));
        
        
        
    }
}
