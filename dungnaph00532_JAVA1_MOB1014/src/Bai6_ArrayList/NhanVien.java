/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6_ArrayList;

/**
 *
 * @author Nguyen Anh Dung
 */
public class NhanVien implements Comparable<NhanVien> {

    private String tenSV;
    private String monSV;
    private int tuoiSV;

    public NhanVien() {
    }

    public NhanVien(String tenSV, String monSV, int tuoiSV) {
        this.tenSV = tenSV;
        this.monSV = monSV;
        this.tuoiSV = tuoiSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "tenSV=" + tenSV + ", monSV=" + monSV + ", tuoiSV=" + tuoiSV + '}';
    }

    public String getMonSV() {
        return monSV;
    }

    public void setMonSV(String monSV) {
        this.monSV = monSV;
    }

    public int getTuoiSV() {
        return tuoiSV;
    }

    public void setTuoiSV(int tuoiSV) {
        this.tuoiSV = tuoiSV;
    }

    @Override
    public int compareTo(NhanVien o) {
        //Sắp xếp theo kiểu String
        //return tenSV.compareTo(o.tenSV);//Sắp xếp theo kiểu chuỗi và sắp xếp xuôi
        //return -tenSV.compareTo(o.tenSV);//Sắp xếp ngược

        //Đối với kiểu số thì cần làm như sau khi sắp xếp ngược
//        if (tuoiSV > o.getTuoiSV()) {
//            return -1;
//        }else if(tuoiSV < o.getTuoiSV()){
//            return 1;
//        }else{
//            return 0;
//        }
        //Đối với kiểu số thì cần làm như sau khi sắp xếp xuôi
        if (tuoiSV > o.getTuoiSV()) {
            return 1;
        }else if(tuoiSV < o.getTuoiSV()){
            return -1;
        }else{
            return 0;
        }
        }

    }
