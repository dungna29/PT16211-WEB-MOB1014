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
public class S7_ToanTu {

    public static void main(String[] args) {
        //Toán tử số học + - * / dùng để tính toán.
        //Trong lập trình toán tử + còn có thể cộng chuỗi
        // Toán tử  ++ thì sẽ tăng giá trị của biến lên 1 đơn vị
        // Toán tử  -- thì sẽ giảm giá trị của biến lên 1 đơn vị
        int a = 6;
        a++;//Nếu biến đứng 1 mình thì ++ ở trước hay sau đều tăng lên 1 và đối với  -- thì tương tự
        ++a;
        int b = 7, c = 2, d = 3;
        int kq = b++ + ++c - d;      
        System.out.println(kq);
        //Nghiên cứu xem tại sao kết quả bằng 7 (Posfix và Prefix)
    }
}
