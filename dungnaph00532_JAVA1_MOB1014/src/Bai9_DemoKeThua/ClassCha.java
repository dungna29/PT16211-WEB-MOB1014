/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9_DemoKeThua;

/**
 *
 * @author LegendNguyen
 */
public class ClassCha {
    private String idCha;
    private String tenCha;
    private int tuoiCha;

    public ClassCha() {
    }

    public ClassCha(String idCha, String tenCha, int tuoiCha) {
        this.idCha = idCha;
        this.tenCha = tenCha;
        this.tuoiCha = tuoiCha;
    }

    public String getIdCha() {
        return idCha;
    }

    public void setIdCha(String idCha) {
        this.idCha = idCha;
    }

    public String getTenCha() {
        return tenCha;
    }

    public void setTenCha(String tenCha) {
        this.tenCha = tenCha;
    }

    public int getTuoiCha() {
        return tuoiCha;
    }

    public void setTuoiCha(int tuoiCha) {
        this.tuoiCha = tuoiCha;
    }
    
    void inRaManHinh(){//Hàm in ra màn hình của lớp cha
        System.out.printf("ID: %s - Ten: %s - Tuoi: %d \n",idCha,tenCha,tuoiCha);
        System.out.println(5+5);
    }
}
