/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8_KeThua;

/**
 *
 * @author LegendNguyen
 */
/*
SinhVien_1 extends Person có nghĩa lớp SinhVien_1 kê thừa các thuộc tính và hàm của lớp Person hay còn gọi là lớp cha
*/
public class SinhVien_1 extends Person{//Để kế thừa 1 lớp trong JAVA các bạn sử dụng từ khóa Extends
    private String masv;//Khác 
    private double gpa;//Khác

    public SinhVien_1() {
        
    }
    //this: Dùng để tham chiếu đến thuộc tính và hàm của lớp hiện tại
    //super: Dùng để tham chiếu đến thuộc tính và hàm của lớp cha
    public SinhVien_1(String masv, double gpa, String ten, String tuoi, String diachi1, String diachi2, String sdt) {
        super(ten, tuoi, diachi1, diachi2, sdt);
        this.masv = masv;
        this.gpa = gpa;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //Để kế thừa 1 hàm của lớp cha các bạn sử dụng phím Alt + Insert
    // Chọn Override Methods và chọn hàm cần kế thừa
    @Override
    void inRaManHinh() {
        //super.inRaManHinh(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Đây là hàm của Sinh Viên kế thừa lớp cha nhưng đã thay đổi nội dung được in ra");
    }
    
    
    
    
}
