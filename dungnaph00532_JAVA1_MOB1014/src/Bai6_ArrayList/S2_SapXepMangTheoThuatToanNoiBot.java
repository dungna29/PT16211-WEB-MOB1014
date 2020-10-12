/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6_ArrayList;

import java.util.Arrays;

/**
 *
 * @author LegendNguyen
 */
public class S2_SapXepMangTheoThuatToanNoiBot {

    public static void main(String[] args) {
        int[] arrNumber = {9, 8, 7, 6, 5, 1, 2};
        System.out.println("--------Trước khi sắp xếp");
        for (int x : arrNumber) {
            System.out.print(x + "\t");
        }
        System.out.println("\n");
//        for (int i = 0; i < arrNumber.length; i++) {
//            for (int j = i + 1; j < arrNumber.length; j++) {
//                int temp = arrNumber[i];
//                if (arrNumber[i] > arrNumber[j]) {
//                    arrNumber[i] = arrNumber[j];
//                    arrNumber[j] = temp;
//                }
//            }
//        }
        System.out.println("-----------");
//        for (int i = 0; i < arrNumber.length; i++) {
//            System.out.println("Lần chạy thứ i: " + i);
//            for (int j = i + 1; j < arrNumber.length; j++) {
//                int temp = arrNumber[i];
//                if (arrNumber[i] > arrNumber[j]) {
//                    arrNumber[i] = arrNumber[j];
//                    arrNumber[j] = temp;
//                }
//                System.out.println("Sau khi so sánh: ");
//                for (int x : arrNumber) {
//                    System.out.print(x + "\t");
//                }
//            }
//        }
        Arrays.sort(arrNumber);//Arrays.sort(arrNumber); dùng để sắp xếp 1 mảng Array
        System.out.println("-----------");
        System.out.println("--------Sau khi sắp xếp");
        for (int x : arrNumber) {
            System.out.print(x + "\t");
        }
    }
}
