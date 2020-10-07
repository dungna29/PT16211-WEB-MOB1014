 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5_OOP_Ham;

/**
 *
 * @author LegendNguyen
 */
public class GiaoVien {
    //Phần 1 Khai báo các thuộc tính ở trên
    //Access modifer private, protected, public, default
    ///private thì thuộc tính hoặc hàm chỉ được phép truy cập ở trong class nó.
    private String name;
    private String sdt;
    //Khi tạo ra 1 lớp đối tượng thông thường sẽ phải private thuộc tính lại

    //Phần 2: khai báo 2 contructor 
    public GiaoVien() {

    }

    public GiaoVien(String name, String sdt) {
        this.name = name;
        this.sdt = sdt;
    }
    
    //Phần 3 gọi phương thức Gettẻ và Setter
    //Alt + Insert

    //Get dùng để giá trị  thuộc tính 
    public String getName() {
        return name;
    }
    
    //Set dùng để gán giá trị cho thuộc tính
    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    //Phần 4 sẽ có các hàm bên trong
    //Có 2 cách để in thông tin của đối tượng ra màn hình
    //Cách 1: Alt + Insert chọn toString
    @Override
    public String toString() {
        return "GiaoVien{" + "name=" + name + ", sdt=" + sdt + '}';
    }
    
    //Cách 2: Viết 1 hàm in ra màn hình
    public void inRaHinh(){
        System.out.printf("Tên Giáo Viên: %s - Số điện thoại: %s \n",name,sdt);
    }
    
    
}
