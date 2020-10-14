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
public class ClassCon extends ClassCha {

    String taisan;//Thuộc tính riêng của đối tượng

    public ClassCon() {
    }

    public ClassCon(String taisan, String idCha, String tenCha, int tuoiCha) {
        super(idCha, tenCha, tuoiCha);
        this.taisan = taisan;
    }

    public String getTaisan() {
        return taisan;
    }

    public void setTaisan(String taisan) {
        this.taisan = taisan;
    }

    //
    void inRaManHinhLopCon() {
        System.out.printf("ID: %s - Ten: %s - Tuoi: %d - TaiSan: %s\n", getIdCha(), getTenCha(), getTuoiCha(), taisan);
    }

    //Nếu muốn kế thừa hàm của lớp cha thì làm như sau
    //Ilt + Insert chọn Overider Method
    @Override
    void inRaManHinh() {
        //super.inRaManHinh(); //To change body of generated methods, choose Tools | Templates.
        System.out.printf("ID: %s - Ten: %s - Tuoi: %d - TaiSan: %s\n", getIdCha(), getTenCha(), getTuoiCha(), taisan);
        System.out.println( 5 + 5 +5 +5+5+5+5+5+5+5+5);
    }

}
