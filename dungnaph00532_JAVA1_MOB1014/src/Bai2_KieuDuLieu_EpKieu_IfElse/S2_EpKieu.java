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
public class S2_EpKieu {
    public static void main(String[] args) {
        int a = 9;
        double b = 2;
        b = a;//Thực hiện hành động gán giá trị của a cho b
        //a = b;//Không thể ép từ kiểu double về int
        a = (int) b;
        
        byte c1 = 1;
        short c2 = 3;
        //c1 = c2;
        c2 = c1;
    }
}
