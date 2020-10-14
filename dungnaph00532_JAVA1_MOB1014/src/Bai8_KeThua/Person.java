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
//Đây được gọi là lớp cha sẽ bao gồm các thuộc tính và hàm chung với lớp con
//Lớp cha cũng như các lớp khác vẫn đầy đủ các thành phần của 1 đối tượng
public class Person {
    private String ten;
    private String tuoi;
    private String diachi1;
    private String diachi2;
    private String sdt;

    public Person() {
        
    }

    public Person(String ten, String tuoi, String diachi1, String diachi2, String sdt) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi1 = diachi1;
        this.diachi2 = diachi2;
        this.sdt = sdt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi1() {
        return diachi1;
    }

    public void setDiachi1(String diachi1) {
        this.diachi1 = diachi1;
    }

    public String getDiachi2() {
        return diachi2;
    }

    public void setDiachi2(String diachi2) {
        this.diachi2 = diachi2;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "Person{" + "ten=" + ten + ", tuoi=" + tuoi + ", diachi1=" + diachi1 + ", diachi2=" + diachi2 + ", sdt=" + sdt + '}';
    }
    void inRaManHinh(){
        System.out.println("Đây là hàm in ra của lớp cha");
    }
    
    
}
