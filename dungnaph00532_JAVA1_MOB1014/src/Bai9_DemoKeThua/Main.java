/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9_DemoKeThua;

/**
 *
 * @author LegendNguyen
 */
public class Main {
    public static void main(String[] args) {
        ClassCon cc = new ClassCon("Nhà", "1", "Haong", 19);//Tương ứng là 1 đối tượng
        cc.inRaManHinhLopCon();
        cc.inRaManHinh();//Hàm của lớp cha mang ra
    }
}
