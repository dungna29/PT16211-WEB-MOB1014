/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7_DemoAssignment;

/**
 *
 * @author LegendNguyen
 */
public class GiaoVien {
    private String maGV;
    private int namsinh;
    private String sdt;

    public GiaoVien() {
    }

    public GiaoVien(String maGV, int namsinh, String sdt) {
        this.maGV = maGV;
        this.namsinh = namsinh;
        this.sdt = sdt;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "GiaoVien{" + "maGV=" + maGV + ", namsinh=" + namsinh + ", sdt=" + sdt + '}';
    }
}
