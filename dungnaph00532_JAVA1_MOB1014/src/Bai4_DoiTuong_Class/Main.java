/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4_DoiTuong_Class;

import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Viết chương trình lấy thông tin của 3 sinh viên
       Sinh viên gồm các thông tin sau
       1. Tên
       2. Mã SV
       3. Tuổi
       Sau khi nhập vào 3 sinh viên thì mới được in thông tin
       của 3 bạn đó ra màn hình
         */
        //Cách số 1
//        String tensv1, masv1, tuoisv1, tensv2, masv2, tuoisv2, tensv3, masv3, tuoisv3;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Mời bạn nhập Tên sinh viên thứ 1");
//        tensv1 = sc.nextLine();
//        System.out.println("Mời bạn nhập Mã sinh viên thứ 1");
//        masv1 = sc.nextLine();
//        System.out.println("Mời bạn nhập Tuổi sinh viên thứ 1");
//        tuoisv1 = sc.nextLine();
//        
//        System.out.println("Mời bạn nhập Tên sinh viên thứ 2");
//        tensv2 = sc.nextLine();
//        System.out.println("Mời bạn nhập Mã sinh viên thứ 2");
//        masv2 = sc.nextLine();
//        System.out.println("Mời bạn nhập Tuổi sinh viên thứ 2");
//        tuoisv2 = sc.nextLine();
//        
//        System.out.println("Mời bạn nhập Tên sinh viên thứ 3");
//        tensv3 = sc.nextLine();
//        System.out.println("Mời bạn nhập Mã sinh viên thứ 3");
//        masv3 = sc.nextLine();
//        System.out.println("Mời bạn nhập Tuổi sinh viên thứ 3");
//        tuoisv3 = sc.nextLine();
        //Sau đoạn này thì in ra màn hình 3 thằng

        //Cách số 2 bài toán về mảng
//        String[] arrTenSV;
//        String[] arrMaSV;
//        String[] arrTuoiSV;
//        int size = 0;
//        System.out.println("Mời bạn chọn số lượng sinh viên bạn muốn thêm");
//        size = Integer.parseInt(sc.nextLine());
//        arrTenSV = new String[size];
//        arrMaSV = new String[size];
//        arrTuoiSV = new String[size];
//        for (int i = 0; i < size; i++) {
//            System.out.println("Mời bạn nhập Tên sinh viên thứ " + i);
//            arrTenSV[i] = sc.nextLine();
//            System.out.println("Mời bạn nhập Mã sinh viên thứ " + i);
//            arrMaSV[i] = sc.nextLine();
//            System.out.println("Mời bạn nhập Tuổi sinh viên thứ " + i);
//            arrTuoiSV[i] = sc.nextLine();
//        }
//        //Lấy ra
//        for (int i = 0; i < size; i++) {
//            System.out.printf("%d. Tên: %s Mã: %s Tuổi: %s \n",i,arrTenSV[i],arrMaSV[i], arrTuoiSV[i]);      
//        }
        //Cách số 3 tạo 1 đối tượng
        //LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG
        //Định nghĩa: Lập OOP là đưa các đối tượng trong cuộc sống như: đối tượng giáo viên, đối tượng sinh viên, đối tượng động vật....
        //vào trong lập trình để có thể thao tác được với các đối tượng đó như: thêm, sửa, xóa...
        //Ngoài ra các bạn có thể thao tác được với các thuộc tính của đối tượng đó.
        //Một đối tượng luôn bao gồm 3 phần: Tên đối tượng (Tên Class), Thuộc tính, Hành vi
        //Giải bài:
        //Để sử dụng 1 đối tượng các bạn cần gọi đúng tên của đối tượng đó       
        //Nếu mà lớp không có Contructor thì JAVA sẽ tạo cho bạn mặc định contructor không tham số
        SinhVien sv1 = new SinhVien(); //Tạo ra 1 đối tượng và new Contructor của đối tượng đó
        //Gán giá trị cho thuộc tính của lớp SinhViên và cho 1 đối tượng 
        sv1.tensv = "Cường";
        sv1.masv = "ph005320";
        sv1.tuoisv = 30;
        //3 dòng trên chính là hành động gán giá trị cho các thuộc tính mà bạn muốn
        System.out.printf("Thông tin Tên:%s Mã SV:%s Tuổi:%d \n", sv1.tensv, sv1.masv, sv1.tuoisv);
        SinhVien sv2 = new SinhVien();
        sv2.tensv = "Cường2";
        sv2.masv = "ph005322";
        sv2.tuoisv = 32;
        System.out.printf("Thông tin Tên:%s Mã SV:%s Tuổi:%d \n", sv2.tensv, sv2.masv, sv2.tuoisv);

        //Tạo đối tượng bằng hàm contructor có tham số
        // Dòng dưới đây là tạo ra 1 đối tượng sinh viên 3 có truyền 3 tham số vào
        SinhVien sv3 = new SinhVien("Cường3", "ph005323", 5);
        System.out.printf("Thông tin Tên:%s Mã SV:%s Tuổi:%d \n", sv3.tensv, sv3.masv, sv3.tuoisv);

        //Bài tập 1 Đặt kiểu dữ liệu cho thuộc tính đúng với thực tế:
        //Tạo 1 lớp Giáo Viên gồm các thuộc tính sau: TenGV,MaGV,TuoiGV,Sdt và 2 contructor
        //Tạo 1 lớp Chó: MaCho,GiongCho,ThucAn,CanNang và 2 contructor 
        //Tạo 1 lớp Meo: MaMeo,GiongMeo,ThucAn,CanNang và 2 contructor 
        
        //Gọi hàm in ra màn hình
        SinhVien sv4 = new SinhVien("Cường4", "ph005323", 5);
        sv4.inRaManHinh();
        SinhVien sv5 = new SinhVien("Cường5", "ph005323", 5);
        sv5.inRaManHinh();
    }
}
