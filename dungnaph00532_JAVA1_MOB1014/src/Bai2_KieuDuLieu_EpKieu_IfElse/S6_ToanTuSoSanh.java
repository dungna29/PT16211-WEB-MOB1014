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
public class S6_ToanTuSoSanh {

    public static void main(String[] args) {
        System.out.println(4 > 4);//False
        System.out.println(4 < 5);//True
        System.out.println(4 >= 4);//True
        System.out.println(4 <= 4);//True
        System.out.println(4 != 4);//True
        System.out.println(4 == 4);//True

        //&& có nghĩa cả 2 về của biểu thức phải true
        System.out.println((4 == 4) && (4 > 4));
        //|| hoặc hoặc có nghĩa là 1 trong 2 vế chỉ cần 1 vế đúng
        System.out.println((4 == 4) || (4 > 4));
        //!Phủ định
        System.out.println(!(4 == 4) || (4 > 4));
    }
}
