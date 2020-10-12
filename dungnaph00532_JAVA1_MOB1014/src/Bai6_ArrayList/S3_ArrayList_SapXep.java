/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author LegendNguyen
 */
public class S3_ArrayList_SapXep {

    public static void main(String[] args) {
        //Khai báo 1 ArrayList Tên kiểu String
        ArrayList<String> arrListName = new ArrayList<>();
        arrListName.add("Z");
        arrListName.add("D");
        arrListName.add("F");
        arrListName.add("G");
        arrListName.add("I");
        arrListName.add("A");
        for (String x : arrListName) {
            System.out.print(x + " \t");
        }
        System.out.println("Sau khi thực hiện sắp xêp");
        //Sử dụng hàm sắp xếp của ArrayList
        Collections.sort(arrListName);//Collections.sort(arrListName) hàm dùng để sắp xếp xuôi
        Collections.reverse(arrListName);//Vẫn là hàm sắp xếp nhưng sắp xếp từ lớn đến bé....Sắp xếp nguợc
        for (String x : arrListName) {
            System.out.print(x + " \t");
        }
        
        System.out.println("-------------------Sắp xếp đối tượng");
        ArrayList<NhanVien> arrListNhanVien = new ArrayList<>();
        arrListNhanVien.add(new NhanVien("Dung", "1", 30));
        arrListNhanVien.add(new NhanVien("Hoàng", "1", 44));
        arrListNhanVien.add(new NhanVien("Tùng", "1", 12));
        arrListNhanVien.add(new NhanVien("Z", "1", 18));
        arrListNhanVien.add(new NhanVien("A", "1", 19));
        NhanVien nv1 = new NhanVien();
        nv1.setMonSV("X");
        nv1.setTenSV("X");
        nv1.setTuoiSV(36);
        arrListNhanVien.add(nv1);
        for (NhanVien x : arrListNhanVien) {
            System.out.println(x.toString());
        }
        System.out.println("Sau khi sắp xếp");
        //Cách sử dụng Comparable để sắp xếp
        //Để sử dụng được Collections.sort(arrListNhanVien) 1 list đối tượng mà không lỗi
        //Các bạn cần phải sử dụng implements Comparable<NhanVien> bên CLASS NHÂN VIÊN
        //Sau đó cần phải kế thừa hàm của Comparable chính là hàm Compareto
        //Collections.sort(arrListNhanVien);
       
        //Cách số 2 sử dụng Comparator thì bên Class ko cần kế thừa inteface
        Collections.sort(arrListNhanVien, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                //return o1.getTenSV().compareTo(o2.getTenSV());
                //return -o1.getTenSV().compareTo(o2.getTenSV());
                if (o1.getTuoiSV() > o2.getTuoiSV()) {
                    return 1;
                }else if(o1.getTuoiSV() < o2.getTuoiSV()){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
        for (NhanVien x : arrListNhanVien) {
            System.out.println(x.toString());
        }
    }
}
