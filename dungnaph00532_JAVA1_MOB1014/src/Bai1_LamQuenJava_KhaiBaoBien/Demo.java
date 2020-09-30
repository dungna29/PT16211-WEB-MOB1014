/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1_LamQuenJava_KhaiBaoBien;

/**
 *
 * @author LegendNguyen
 */
public class Demo {
   
    public static void main(String[] args) {
        //Giải bài 1
        int a = 5,b = 5,kq;
        kq = a + b;
        System.out.println("Kết quả 5 + 5 = " + kq);
        //Giải bài 2
        String ten = "dungna", quequan ="HCM";
        int tuoi = 25;
        System.out.println("Tên: "+ ten + "Tuổi: " + tuoi);
        System.out.println("*********************");
        double PI1 = 3.14;
        PI1 = 3;
        System.out.println(PI1);
        final double PI2 = 3.14;
        //PI2 = 3; Không thể gán lại giá trị cho hằng số PI2
        System.out.println(PI2);
    }
}
