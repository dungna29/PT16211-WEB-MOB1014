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
public class S4_KhaiBaoBien {

    String name = "Dung";//Khai báo biến toàn cục

    public static void main(String[] args) {
        // *********** Biến khái niệm cơ bản ***********
        //Cú pháp khai báo biến <kiểu dữ liệu> <tên biến> [=giá trị khởi đầu];
        // Nên đặt tiếng Anh.
        String name = "Dung";//Cách khai báo cục bộ
        int number = 1;
        int Number = 1;//Phân biệt chữ hoa và chữ thường và trong 1 hàm chỉ có 1 tên biến duy nhất

        int a, b, c, d = 9;
        String name2;//Khai báo biến chưa khởi tạo giá trị bên trong
        String name3, name4, name5, name6 = "Java1";//Khai báo nhiều biến trên một dòng
        //sout + tab xuất in màn hình nhanh
        System.out.println(name6);//Câu lệnh in ra màn hình

        // *********** Quy Tắc Đặt Tên Biến ***********        
        //Tên biến có phân biệt chữ Hoa và chữ thường
        // String firstname;// Kiểu Normal  //Sử dụng khi tên biến có 2 từ trở lên
        // String FirstName; //Kiểu CamelCase //Sử dụng khi tên biến có 2 từ trở lên
        // String first_name; // Kiểu Underscores //Sử dụng khi tên biến có 2 từ trở lên 
        // Lưu ý: đặt tên biến không được phép bắt đầu bởi số , có dấu gạch ngang, sử dụng từ khóa của java (int,if,long....)
        // int int = 5; //Vi phạm nguyên tắc đặt biến
        // Trong cùng 1 class thì biến phải sử dụng tên khác nhau và đặt sao cho đúng nghĩa đại diện
        String number9 = "Java2"; // gây hiểu nhầm ko đặt tên nghĩa bị sai với ý định dùng

        // *********** Các kiểu dữ liệu của biến ***********
        //String: "xin chao cac ban" "moi ban nhap vao"
        //Char : 'D' 'E' 'a' '1' '2' '\u0040' = @ '\u0041'
        //short : 33 56 78 2 4 3
        //int : 33 56 78 2 4 3
        //long: 33 56 78 2 4 3
        //byte: 1 2 3 4 8 9
        //float: 3.14 5.5 6.2 7.2   
        //double 3.14 5.5 6.2 7.2
        //boolean: true false       
        //Luyện tập tự khai báo để nhớ tên kiểu dữ liệu và loại dữ liệu mà kiểu dữ liệu đó chấp nhận.
        // *********** Biến cục bộ và biến toàn cục ***********
        //Biến cục bộ là biến bên trong của một hàm còn biến toàn cục nằm trong class và không nằm bên trong hàm
        //Hằng số final: bạn không thể thay đổi giá trị của biến final (nó sẽ là hằng số).
        //Bạn không thể gán lại giá trị cho biến đó
        //final String userName = "admin";//        
    }
}
