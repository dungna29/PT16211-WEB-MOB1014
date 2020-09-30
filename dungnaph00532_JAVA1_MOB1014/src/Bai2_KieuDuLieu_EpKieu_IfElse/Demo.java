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
public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        float a1 = Float.parseFloat(sc.nextLine());
        int a2 = Integer.parseInt(sc.nextLine());//int ép kiểu về thì phải dùng Integer
        byte a3 = Byte.parseByte(sc.nextLine());
        short a4 = Short.parseShort(sc.nextLine());
        long a5 = Long.parseLong(sc.nextLine());
        System.out.println(a);
    }
}
