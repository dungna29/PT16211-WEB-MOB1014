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
public class S1_Ham {

    public static void main(String[] args) {
        //Để gọi được hàm cần phải biết tên của hàm và tham số
        inRaManHinh();
        inRaManHinh2(2020);
        inRaManHinh2(2021);
        inRaManHinh2(2022);
        System.out.println("-----------------");
        inRaManHinh2("9999");
        inRaManHinh2(2020, "Fall");
        inRaManHinh2(2020, "Fall", "dungna");
        System.out.println("-----------------Hàm Trả về kiểu mảng");
        for (int x : getArrYear()) {
            System.out.println(x);
        }        
        System.out.println(getNamHienTai()+1);
        //-------------------------------------
        System.out.println("-----------------------");
        //Kết quả của hàm có tham số là 1 mảng
         int []arrNumber = {1,1989,1990,1991,1992,9};
        testFunc1(arrNumber);//Hàm này dùng để in 1 mảng ra màn hình
        System.out.println("Độ dài của mảng trên là: " + testFunc2(arrNumber));//Chỉ ra độ dài của mảng
    }

    //Khái niệm về hàm
    //P1: Hàm không trả về là void
    // void: kiểu không trả về
    // tên hàm nên là động từ đứng trước và các từ viết sau viết hoa chữ cái đầu
    static void inRaManHinh() {
        //Bên trong 1 hàm các bạn có thể thực hiện 1 công việc nào đó tùy theo bài toán
        System.out.println("POLY 2020");
    }

    //Hàm không trả về hưng có tham số:
    //inRaManHinh2(int nam) bên trong ngoặc được gọi là tham số truyền vào ở đây có 1 tham số
    //Có thể đưa nhiều tham số và nhiều kiểu dữ liệu khác nhau vào tùy theo mục đích sử dụng
    static void inRaManHinh2(int nam) {
        System.out.println("POLY" + nam);
    }

    //OverLoading là gì?
    //Trong lập trình tên biến có được giống nhau không? Không
    //Khi đặt tên hàm cũng ko được giống nhau
    //Nhưng trong lập trình hướng đối tượng có tính đa hình
    //Hàm chỉ được giống tên nhau khi chúng khác tham số truyền vào
    //Kết luận đây là tính đa hình trong lập trình hướng tượng
    static void inRaManHinh2(String nam) {
        //Code bên trong xử lý sẽ khác nhau
        System.out.println("POLY" + nam);
    }

    static void inRaManHinh2(int nam, String kyhoc) {
        //Code bên trong xử lý sẽ khác nhau
        System.out.println("POLY" + nam +" "+kyhoc);
    }

    static void inRaManHinh2(int nam, String kyhoc, String tenSV) {
        //Code bên trong xử lý sẽ khác nhau
        System.out.println("POLY" + nam +" "+kyhoc + " " + tenSV);
    }
    
    //P2: Hàm trả về là hàm có kiểu dữ liệu ở đầu hàm và trong hàm bắt buộc phải return về 1 giá trị hoặc 1 tập giá trị
    //Hàm trả về cũng có tham số và không tham số giống như hàm void.
    static int getNamHienTai(){//int getNamHienTai() hàm được định nghĩa trả về 1 số nguyên
        return 2020;
    }//Cả hàm tinhTongHaiSo() sẽ trả lại 1 giá trị
    
    //int[] getArrYear() được gọi là hàm trả về 1 tập hợp các số nguyên. Và có kiểu dữ liệu là 1 mảng
    static int[] getArrYear(){
        int []arrNumber = {1989,1990,1991};
        return arrNumber;//Phải return về đúng kiểu dữ liệu của hàm này
    }
    
    //Tham số truyền vào với cả hàm trả về hoặc không trả về có thể là 1 giá trị hoặc 1 tập giá trị
    static void testFunc1(int[] arrTemp){//Hàm không trả về sử dụng tham số cần truyền vào là 1 mảng kiểu số nguyên
        for (int i = 0; i < arrTemp.length; i++) {
            System.out.println(arrTemp[i]);
        }
    }
    
    static String testFunc2(int[] arrTemp){//Mảng trả về kiểu String và tham số truyền vào là 1 mảng số nguyên
       
        return String.valueOf(arrTemp.length);//Trả về độ dài của mảng bạn truyền vào và ép kiểu từ số về chuỗi
    }
}
