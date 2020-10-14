/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai10_XuLyChuoi;

/**
 *
 * @author LegendNguyen
 */
public class S3_DemoXuLyChuoi {

    public static void main(String[] args) {
        String name = "do van duy";
        String name2 = "do van duy viet nam";
        //Viết ra 1 hàm có thể viết hoa tất cả chữ cái đầu của từ 
        //phía trên - có thể truyền tên dài hay ngắn đều có thể xử 
        //lý được  
        String []arrName = name2.split("\\s");
        for (String x : arrName) {
            System.out.print(vietHoaChuCai(x) + " ");
        }

    }

    static String vietHoaChuCai(String name) {
        String temp = String.valueOf(name.charAt(0)).toUpperCase() + name.substring(1,name.length());        
        return temp;
    }

}
