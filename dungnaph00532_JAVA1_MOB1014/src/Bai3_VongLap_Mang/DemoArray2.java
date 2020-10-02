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
public class DemoArray2 {

    public static void main(String[] args) {
        /* Viết 1 chương trình cho phép nhập số lượng tên
        theo nhu cầu của người dùng nhập vào
         */
        String input;//Lấy giá trị từ bàn phím
        String[] arrName;//Khai báo không khởi tạo kích thước mảng ban đầu
        int sizeArr;//chứa kích thước mảng do người dùgn nhập vào
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn chọn số lượng Tên muốn nhập vào: ");
        sizeArr = Integer.parseInt(sc.nextLine());//Lấy số lượng tên mà người dùng muốn để khởi tạo mảng
        //Ngay sau khi người dùng nhập kích thước mảng thì sẽ thực hiện khởi tạo mảng ngay
        arrName = new String[sizeArr];//Khởi tạo mảng theo kích thước người dùng muố

        //Sử dụng vòng lặp để có thể nhiều giá trị cùng một lúc vào mảng
        //Điều kiện để ngắt vòng lặp là kích thước của mảng
        //Vòng lặp chỉ chạy đúng theo số lần người dùng nhập số lượng ở trên
        for (int i = 0; i < sizeArr; i++) {
            System.out.print("Mời bạn nhập tên thứ: " + i + " ");
            //Gán giá trị vào mảng theo index 
            //index ở đây chính là i chạy từ 0 đến vị trí cuối cùng của mảng
            arrName[i] = sc.nextLine();         
        }
        
        //In ra mảng đã có sẵn ra màn hình
        //Gọi đến mảng tên đã tạo ở trên
        //arrName.length được gọi là hàm dùng để lấy độ dài của mảng
        for (int i = 0; i < arrName.length; i++) {
            //In ra màn hình theo index và index ở đây là i vì i chạy từ 0 cho đến độ dài của mảg
            System.out.println("In danh sách tên trong mảng");
            System.out.print(arrName[i] + " ");
        }
    }
}
