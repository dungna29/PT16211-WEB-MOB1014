/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3_VongLap_Mang;

/**
 *
 * @author LegendNguyen
 */
public class DemoArray {

    public static void main(String[] args) {
        int a = 2020, b = 2021, c = 2020;//Khai báo 1 biến để chứa 1 giá trị có kiểu số nguên
        //1 biến thì chỉ có thể lưu trữ được 1 giá trị

        //P1. Mảng Array
        //Mảng giúp lưu trữ được nhiều giá trị mà chỉ cần khai báo 1 lần
        //1. Cách khai báo 1 mảng
        //Dưới đây là khai báo 1 mảng có khởi tạo giá trị ban đầu
        //Kiểu dữ liệu của mảng là kiểu số nguyên
        int[] arrYear = {1900, 1901, 1902};
        int arrYear2[];//khai báo 1 mảng không khởi tạo giá trị ban đầu
        //arrYear2[0] = 1;//Lỗi vì mảng arrYear2 chưa được khởi tạo vùng nhớ 
        //Dưới đây là khai báo mảng có khởi tạo ra vùng chứa 3 phần tử
        int arrYear3[] = new int[3];//int[3] khai báo kích thước mảng
        //2. Cách gán giá trị cho mảng theo index chỉ định
        arrYear3[0] = 1900;//Gán giá trị vào index 0 được chỉ định trọng ngoặc vuông
        arrYear3[2] = 1902;

        //3. Lấy giá trị trong mảng để in ra màn hình
        //Để lấy được giá trị bạn cần phải biết index của giá trị trong mảng
        System.out.println("Vị trí 0 của mảng là: " + arrYear3[0]);
        System.out.println("Vị trí 1 của mảng là: " + arrYear3[1]);
        System.out.println("Vị trí 2 của mảng là: " + arrYear3[2]);

        //4. Các kiểu dữ liệu của mảng double,float,String.....
        String[] name;
        String[] name1 = new String[9];
        String name2[] = {"JAVA1", "JAVA2", "JAVA3"};

    }
}
