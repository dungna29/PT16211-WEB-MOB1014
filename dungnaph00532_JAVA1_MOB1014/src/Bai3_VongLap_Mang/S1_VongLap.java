/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3_VongLap_Mang;

import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class S1_VongLap {

    public static void main(String[] args) {
        //Bài 1: In ra màn hình 20 câu Học lại JAVA1 + 1
//        System.out.println("Học lại JAVA1 Lần 1");
//        System.out.println("Học lại JAVA1 Lần 2");
//        System.out.println("Học lại JAVA1 Lần 3");
//        System.out.println("Học lại JAVA1 Lần 4");
//        System.out.println("Học lại JAVA1 Lần 5");
//        System.out.println("Học lại JAVA1 Lần 6");
        //Vòng lặp: Lặp lại 1 công việc nào đấy
        //1. FOR: for + TAB       
//        for (int i = 1; i <= 20; i++) {
//            System.out.println("Giá trị của i: " + i);
//            //Đưa công việc cần lặp vào bên trong
//            System.out.println("Học lại JAVA1 Lần " + i);
//            
//        }
        //2. While: whilexp +tab
        // While là vòng lặp vô hạn nếu điều kiện luôn đúng không điểm dừng như là = true
        // Để vòng lặp While chạy thì mệnh đề phải luôn đúng
        int a = 5, b = 9, i = 1;
//        while (a < b) {
//            System.out.println("Học lại JAVA1 Lần ");
//        }
//        while (i <= 20) {
//            //Lần 1 thì i = 1
//            System.out.println("Học lại JAVA1 Lần " + i);
//            i++;//Lần 1: i = 2
//        }
        //3 Do While: vòng lặp này phải chạy ít nhất là 1 lần cho dù While có bị False
//        do {
//            System.out.println("Học lại JAVA1 Lần ");
//        } while (a < b);//5>9
        do {            
            System.out.println("Học lại JAVA1 Lần " + i);
            i++;         
            System.out.println("");
        } while (i <= 20);//Điều kiện để ngắt vòng lặp

        //Viết 1 chương trình cho phép người
        //dùng nhập vào bảng cửu chương
        //Và in ra màn hình đúng bảng cửu chương đó
        //Hỏi người dùng có muốn in bảng cửu chương khác không?
        //nếu người dùng trả lời là Y thì lại mời 
        //ND nhập vào bảng cửu chương khác
        
        //Gợi ý chỗ mời người dùng nhập vào nên cho vào vòng LẶP
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.println("Bạn có muốn tiếp tục hay không: ");
            String temp = sc.nextLine();            
            if (temp.equals("y")) {
                //ngắt vòng lặp ở đây bằng break
                break;
            }
        } while (true);
    }
}
