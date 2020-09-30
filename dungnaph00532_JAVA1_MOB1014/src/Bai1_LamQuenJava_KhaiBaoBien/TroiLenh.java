/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1_LamQuenJava_KhaiBaoBien;

import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class TroiLenh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Mời bạn nhập tuổi :");
        //2 Cách chống trôi lệnh trong java
        // Bất cứ khi nào các bạn sử dụng sc.next các kiểu số thì đều phải thực hiện việc chống trôi lệnh
        //Cách 1: int tuoi = Integer.parseInt(sc.nextLine());//Cách 1 Ép kiểu String về số
        int tuoi = sc.nextInt();
        sc.nextLine();//Cách 2 sử dụng thêm 1 sc.nexLine() để chống trôi lệnh
        System.out.print("Mời bạn nhập tên :");
        String ten = sc.nextLine();
        System.out.println(tuoi + "   " + ten);
    }
}
