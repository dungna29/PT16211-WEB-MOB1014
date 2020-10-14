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
public class GiaoVu_1 {

    private String magv;//khác
    private double workhours;//Khác

    public GiaoVu_1() {
    }

    public GiaoVu_1(String magv, double workhours) {
        this.magv = magv;
        this.workhours = workhours;
    }

    public String getMagv() {
        return magv;
    }

    public void setMagv(String magv) {
        this.magv = magv;
    }

    public double getWorkhours() {
        return workhours;
    }

    public void setWorkhours(double workhours) {
        this.workhours = workhours;
    }
    
}
