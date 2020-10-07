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
public class Main {
    //OOP (LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG) (OBJECT ORIENTED PROGRAMMING)
    //Class: Một tập hợp các đối tượng bên trong gọi là Class. 
    //Đối tượng (Object): được xem là một thực thể trong thế giới thực.
    //Object bao gồm: Thuộc tính (Attribute/Properties) và Phương Thức (Hàm) (Method)
    //Attribute: Các thuộc tính của đối tượng

    //***4 Tính chất quan trọng của OOP***
    //Tính trừu tượng (abstraction):
    //Trừu tượng có nghĩ là tổng quát hóa một cái gì đó lên. không cần chú ý chi tiết bên trong.
    //Tính đóng gói (encapsulation):
    //Tính chất này nhằm bảo vệ đối tượng không bị truy cập từ code bên ngoài vào để thay
    //đổi giá trị các thuốc tính hay có thể truy cập trực tiếp. Việc này do người lập trình
    //viết ra để bảo mật lớp. Tính chất này giúp bảo vệ toàn vẹn đối tượng trong java.        
    //Tính đa hình (polymorphism): 
    //Đối với tính chất đa hình, nó được thể hiện rõ qua việc gọi phương thức của đối tượng.
    //Các phương thức hoàn toàn có thể giống nhau, nhưng việc xử lý luồng có thể khác nhau.
    //Overiding và OverLoading
    //Tính kế thừa (inheritance): 
    //Tính kế thừa cho phép ta xây dựng một lớp mới dựa trên các định nghĩa của một lớp đã có. 
    public static void main(String[] args) {
        GiaoVien gv = new GiaoVien("Dungna", "086555555");
        //Sử dụng hàm get bên Class đối tượng để lấy giá trị của thuộc tính ra
        System.out.println(gv.getName() + " " + gv.getSdt());

        //Tạo ra 1 đối tượng giáo viên
        GiaoVien gv2 = new GiaoVien();
        //Gán giá trị cho các thuộc tính của Giáo viên bằng hàm Set
        gv2.setName("Toàn");
        gv2.setSdt("123456");
        //In thông tin của đối tượng ra màn hình sử dụng cộng chuỗi các thuộc tính
        //Cách 1:    
        //System.out.println(gv2.getName() + " " + gv2.getSdt());
        //Cách 2: sử dụng hàm toString để in ra màn hình
        System.out.println(gv2.toString());
        //Cách 3: Sử dụng hàm tự viết để in dối tượng ra màn hình
        gv2.inRaHinh();
    }
    
    

}
