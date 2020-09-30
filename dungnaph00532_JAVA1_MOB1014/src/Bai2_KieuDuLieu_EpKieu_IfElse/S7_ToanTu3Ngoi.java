/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2_KieuDuLieu_EpKieu_IfElse;

/**
 *
 * @author LegendNguyen
 */
public class S7_ToanTu3Ngoi {

    public static void main(String[] args) {
        boolean a = 5 < 6 ? true : false;
        String a1 = 5 < 6 ? "Đúng" : "Sai";
        String a2 = ((5 < 6) && (5 > 6)) && ((5 < 6) && (5 > 6)) ? "Đúng" : "Sai";
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
    }
}
