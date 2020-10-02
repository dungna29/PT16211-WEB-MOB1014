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
public class S9_SwitchCase {

    public static void main(String[] args) {
        //Viết 1 chương trình cho phép chọn chức năng
        //Chương trình gồm 2 chức năng cộng và trừ 2 số
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        //Ví dụ
        char ch = 'a';
        switch (ch) {
            case 'a':
                //Thực hiện 1 công việc bên trong 1 case
                break;//Phải có break ở đây nếu không có thì sẽ không ngắt mà sẽ chạy tiếp xuống case tiếp theo
            case 'b':
                break;
            default: //Trong trường hợp chọn chức năng không có
                System.out.println("Chức năng bạn chọn không tồn tại");
        }
        while (true) {
            System.out.println("Mời bạn nhập số a: ");
            a = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập số b: ");
            b = Integer.parseInt(scanner.nextLine());
            System.out.println("--Mời bạn chọn chức năng dưới đây--");
            System.out.println("1. Phép cộng");
            System.out.println("2. Phép trừ");
            c = Integer.parseInt(scanner.nextLine());
            //Cách 1 sử dụng If else
//            if (c == 1) {
//                 System.out.printf("Phép cộng: %d + %d = %d \n",a,b,a+b);
//            }else if(c == 2){
//                System.out.printf("Phép cộng: %d - %d = %d \n",a,b,a-b);
//            }else{
//                System.out.println("Chức năng bạn chọn không tồn tại");
//            }
            //Cách 2 sử dụng Switch Case để làm menu
            switch (c) {//Truyền giá trị để chọn em tương ứng với case nào
                case 1:
                    //Thực hiện 1 công việc bên trong 1 case
                    System.out.printf("Phép cộng: %d + %d = %d \n", a, b, a + b);
                    break;//Phải có break ở đây nếu không có thì sẽ không ngắt mà sẽ chạy tiếp xuống case tiếp theo
                case 2:
                    System.out.printf("Phép cộng: %d - %d = %d \n", a, b, a - b);
                    break;
                default: //Trong trường hợp chọn chức năng không có
                    System.out.println("Chức năng bạn chọn không tồn tại");
            }

        }

    }
}
