/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8_KeThua_XuLyChuoi;

/**
 *
 * @author LegendNguyen
 */
public class Main {

    public static void main(String[] args) {
        //Kế thừa là 1 trong 4 tính chất của lập trình hướng đối tượng
        //Kế thừa trong cuộc sống???? Kế thừa tài sản, kế thừa nợ, kế thừa gen di truyền....
        //Trong lập trình có Class Cha và Class Con và con thì có thể kế thừa các thuộc tính và hàm của lớp cha
        //Kế thừa giúp giảm tải code, thời gian trong lập trình 

        //this: Dùng để tham chiếu đến thuộc tính và hàm của lớp hiện tại
        //super: Dùng để tham chiếu đến thuộc tính và hàm của lớp cha
        SinhVien_1 sinhVien_1 = new SinhVien_1();
        //Trong trường hợp  này con ở đây là SinhVien_1 đã kế thừa hết các thuộc tính của lớp ch là Person
        sinhVien_1.setTen("Dung");
        sinhVien_1.setMasv("Dung");
        sinhVien_1.setTuoi("Dung");
        sinhVien_1.setSdt("Dung");
        sinhVien_1.setDiachi1("Dung");
        sinhVien_1.setDiachi2("Dung");   
        sinhVien_1.inRaManHinh();//Ghi đè phương thức của lớp cha
        GiaoVu_1 giaoVu_1 = new GiaoVu_1();
        //giaoVu_1.setTen("Dung"); Bên đối tượng Giáo vụ không thể setTen là vì nó không kế thừa đến Person 
        //Vì vậy nó không được hưởng các thuộc tính và hàm của lớp cha
        //Nếu vẫn cố không kế thừa thì nó phải tự khai báo các thuộc tính mà nó cần trong class của nó.

    }
}
