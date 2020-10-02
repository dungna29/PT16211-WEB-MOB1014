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
public class S3_Array {
    public static void main(String[] args) {
         //Mảng Arrays trong java (Mảng index luôn bắt đầu từ 0 chứ không phải 1)
        //1. Khai báo một mảng có khởi tạo giá trị hoặc không khởi tạo giá trị 
        //Kiểu dữ liệu [] Tên mảng;  
        //Kiểu dữ liệu Tên mảng[];
        //Kiểu dữ liệu Tên mảng[] = {value,value,value};//Khai báo trực tiếp giá trị  

        int _number1 = 5, _number2 = 4, _number3 = 3;//Cách khai báo khi cần sử dụng nhiều biến để lưu giá trị       
        int arrNumber[] = {5, 4, 3, 9, 8, 7};//Khai báo mảng và khởi tạo giá trị cho mảng
        String[] arrName = {"HuyNA89", "LongLD15", "DuyLV32", "TrangNT98"};
        double[] arrMoneys = {8.6, 9.2, 5.7};

        int arrOld[] = new int[10];//Số 10 đại diện cho số phần tử có ở trong mảng
        int arrYear[];//Khai báo mảng nhưng chưa khởi tạọ kích thước mảng và giá trị trong mảng
        arrYear = new int[5];

        //Để lấy được giá trị ra khỏi mảng các bạn phải biết index của giá trị đó là số mấy
//        System.out.println(arrName[0]);
//        System.out.println(arrName[1]);
//        System.out.println(arrName[2]);
//        System.out.println(arrName[3]);
//        System.out.println("---------------------------");
        //In được tất cả các phần tử ở trong mảng thì cần phải sử dụng vòng lặp       
        //fore + TAB cách gõ nhanh vòng lặp foreach
        for (double x : arrMoneys) {
            System.out.println(x);
        }

//        for (int x : arrYear) {
//            
//        }
//        System.out.println("Kích thước của mảng Name là: " + arrName.length);
        //for + TAB cách gõ nhanh vòng lặp for i
        for (int i = 0; i < arrName.length; i++) {//arrName.length là kiểu số nguyên là đại diện kích thước của mảng
            System.out.println(arrName[i]);//Truyền mảng và vị trí được sử dụng để in ra là i
        }
        //******************************************************        
        //1A. Khai báo một mảng khởi tạo kích thước mảng.        
        //Tên mảng = new Kiểu dữ liệu[Kích thước mảng];
        //******************************************************    
        //2. Gán giá trị một phần tử trong mảng
        //Tên Mảng[Index] = Value;
        //******************************************************
        //3. Lấy một phần tử trong mảng và in ra màn hình.
        //Tên Mảng[Index] in ra giá trị của phần tử trong mảng theo index
        //******************************************************
        //4. In nhiều phần tử trong mảng ra màn hình bằng vòng lặp
        //Sử dụng vòng lặp tăng index trong mảng để in ra các phần tử trong mảng chú ý đến số lần vòng lặp chạy
        //******************************************************
        //5. Tìm kiếm giá trị của phần tử trong mảng sử dụng BinarySearch (cách này phải sắp xếp mảng) binarySearch(Object[] a, Object key)
        //******************************************************
        //6. Tìm kiếm phần tử trong mảng theo cách thủ công bằng vòng lặp
        //******************************************************
        //7. Sắp xếp mảng bẳng Arrays Sort
        //******************************************************
        //8. Gán giá trị mặc định cho tất cả phần tử trong mảng fill(int[] a, int val)
        //******************************************************
        //9. So sánh 2 độ dài 2 mảng Arrays Boolean equals(long[] a, long[] a2) trả ra giá trị đúng hay sai.
        //******************************************************
        //10. Sắp xếp mảng 1 chiều sử dụng thuật toán sắp xếp
        //******************************************************  
        //1B. Mảng 2 chiều (Ma Trận)
        //Khai báo mảng 2 chiều:
        //[Kiểu_dữ_liệu] Tên_mảng[][];
        //[Kiểu_dữ_liệu][][] Tên_mảng;       
        //[Kiểu_dữ_liệu] Tên_mảng[][] = new [Kiểu_dữ_liệu] [Số_dòng][Số_cột];
        //Gán dữ liệu cho phần tử mảng 2 chiều
        //Tên_mảng[Chỉ_số_dòng][Chỉ_số_cột] = Value;
        //******************************************************
    }
}
