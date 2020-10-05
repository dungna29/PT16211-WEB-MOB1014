/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4_DoiTuong_Class;

/**
 *
 * @author LegendNguyen
 */
//Tạo ra 1 lớp đối tượng là Sinh Viên
//Mỗi 1 đối tượng được tao sẽ có các thuộc tính riêng phù hợp với ngữ cảnh
public class SinhVien {
    //Dưới đây là các thuộc tính của Sinh viên mà đầu bài cần
    String tensv;
    String masv;
    int tuoisv;
    
    //Bắt buộc khi mới học về lập trình phải tạo 2 hàm contructor là có tham số và không tham số
    //Tạo 1 contructor không tham số
    //Alt + Insert
    //Contructor luôn phải giống tên với Class
    //Khi khai báo contructor bắt buộc phải khai báo sau thuộc tính
    public SinhVien() {
    }
    //Tạo 1 contructor có tham số
    public SinhVien(String tensv, String masv, int tuoisv) {
        this.tensv = tensv;
        this.masv = masv;
        this.tuoisv = tuoisv;
    }
    
    
    
    //Hàm in thuộc tính của đối tượng ra màn hình
    void inRaManHinh(){
         System.out.printf("Thông tin 2020 Tên:%s Mã SV:%s Tuổi:%d \n", tensv, masv, tuoisv);
    }
    
    
}
