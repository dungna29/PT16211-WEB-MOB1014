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
public class S1_ArrayList {

    //ArrayList
    public static void main(String[] args) {
        //P1. Mảng Array
        int[] a = new int[8];//Khai báo  1 mảng số nguyên có độ dài là 8 phần tử
        //1. Mảng Array bắt buộc phải tạo độ dài của mảng thì mới có thể lưu trữ được giá trị
        //2. Nếu không dùng hết các vị trí lưu trữ thì nó vẫn được tạo ra gây lãng phí tài nguyên

        //P2. ArrayList
        //Giải quyết tất cả những vấn đề trên của mảng hiện nay
        //Không cần phải khai báo kích thước và có thể dùng cả kiểu không định kiểu dữ liệu
        //P2.1 ArrayList không định kiểu
        //Cách khai báo 1 Arraylist không định kiểu
        ArrayList arrlistKhongDinhKieu = new ArrayList();
        //Gán giá trị cho ArrayList sử dụng hàm add(<Truyền giá trị vào đây")
        arrlistKhongDinhKieu.add("89");//Add String vào Arraylist
        arrlistKhongDinhKieu.add(2020);//Add số nguyên vào Arraylist
        arrlistKhongDinhKieu.add(8.6);//Add số thực
        //In ra màn hình các phần tử trong ArrayList dùng for
        //Dùng hàm get(index)để lấy phần tử ra khỏi ArrayList
        //System.out.println(arrlistKhongDinhKieu.get(0));
//        for (int i = 0; i < arrlistKhongDinhKieu.size(); i++) {//arrlistKhongDinhKieu.size() là độ dài của ArrayList
//            System.out.println(arrlistKhongDinhKieu.get(i));
//        }
//        for (var x : arrlistKhongDinhKieu) {
//            System.out.println(x);
//        }

        //P2.2 ArrayList có định kiểu
        ArrayList<String> arrlstName = new ArrayList<String>();
        arrlstName.add("JAVA1");
        arrlstName.add("JAVA2");
        arrlstName.add("JAVA3");
//        for (String x : arrlstName) {
//            System.out.println(x);
//        }
        //P3.2 ArrayList kiểu đối tượng
        //Khai báo 2 đối tượng Student
        Student st1 = new Student("Java1", "Java", 30);
        Student st2 = new Student("Java1", "Java", 30);
        ArrayList<Student> arrlstStudent = new ArrayList<>();
        arrlstStudent.add(st1);
        arrlstStudent.add(st2);
        for (Student x : arrlstStudent) {
            System.out.println(x.getTenSV());
        }
    }

     static void JavaArrayList() {
        //ArrayList List không định kiểu
        ArrayList arrlstKhongDinhKieu = new ArrayList();
        //Phương thức add
        arrlstKhongDinhKieu.add("Duy Anh");
        arrlstKhongDinhKieu.add(2020);
        arrlstKhongDinhKieu.add(2020);//Interger
        arrlstKhongDinhKieu.add(1.5);//Double
        arrlstKhongDinhKieu.add("a");
        arrlstKhongDinhKieu.add(true);
        //Khi add thêm tử kiểu dữ liệu nguyên thủy thì nó tự động chuyển sang đối tượng Wrapper
//        double temp = arrlstKhongDinhKieu.get(3);//Lỗi
//       double temp = (double) arrlstKhongDinhKieu.get(3);
//        System.out.println(temp);
        //Khi truy xuất các phần tử, cần ép về kiểu gốc của phần tử để xử lý
        // Double temp = (Double) arrlstKhongDinhKieu.get(3);
        //Phương thức get dùng để lấy giá trị trong List theo index
        System.out.println(arrlstKhongDinhKieu.get(5));
        for (Object x : arrlstKhongDinhKieu) {
            System.out.println(x);
        }

        // List có định kiểu
        ArrayList<Double> arrlstCodinhKieuDouble = new ArrayList<Double>();
        arrlstCodinhKieuDouble.add(9.5);
        arrlstCodinhKieuDouble.add(7.5);
        arrlstCodinhKieuDouble.add(4.5);
        double temp = arrlstCodinhKieuDouble.get(0);
        Double temp2 = arrlstCodinhKieuDouble.get(0);
        for (Object x : arrlstCodinhKieuDouble) {
            System.out.println(x);
        }

        //Sử dụng các
        ArrayList<String> arrListName = new ArrayList<>();
        //Phương thức add dùng để chèn phần tử vào cuối của arrlist
        arrListName.add("Nam");
        arrListName.add("Anh");
        arrListName.add("Duy");
        arrListName.add("My");
        //boolean remove(Object) dùng để tìm và xóa phần tử trong ArrayList
        // arrListName.remove("Duy");
        ///boolean remove(index) dùng để tìm và xóa phần tử theo index
        //arrListName.remove(1);        
        //Clear() dùng để xóa các phần tử bên trong Arraylist
        //arrListName.clear();
        //Set Object dùng để sửa phần tử ở trong mảng theo index chỉ định
        //arrListName.set(1, "Hoang");
        //Hàm dùng để tìm ra kích thước mảng
        System.out.println("Kích thước của List là: " + arrListName.size());
        ///Lấy 1 phần tử ra khỏi List và in ra thì dùng get
        System.out.println("Phần tử tại vị trí 1 là: " + arrListName.get(1));
        //Contains dùng để kiểm tra 1 phần tử có trong danh sách hay không
        if (arrListName.contains("Duy Anh1")) {
            System.out.println("Bạn Duy Anh có trong lớp WEB");
        } else {
            System.out.println("Người bạn tìm không tồn tại trong danh sách Lớp WEb");
        }
        //Tìm vị trí của phần tử
        System.out.println("Bạn Mỹ đang đứng thứ  " + arrListName.indexOf("My"));
        //isEmpty kiểm tra
        //arrListName.clear();
        System.out.println(arrListName.isEmpty());
        //Sắp xếp sort
        Collections.sort(arrListName);
        for (Object x : arrListName) {
            System.out.print(x + " | ");
        }

        Student student1 = new Student("Dung", "JAVA1", 20);
        Student student2 = new Student("Phong1", "JAVA1", 21);
        Student student3 = new Student("Duy", "JAVA1", 18);
        Student student4 = new Student("HOA", "JAVA1", 19);
        ArrayList<Student> arrlstStudent1 = new ArrayList<Student>();
        arrlstStudent1.add(student1);
        arrlstStudent1.add(student2);
        arrlstStudent1.add(student3);//Add 1 OBJ vào list student
        ArrayList<Student> arrlstStudent2 = new ArrayList<Student>();
        arrlstStudent2.add(student4);//Add 1 OBJ vào list student
        //AddAll
        //arrlstStudent1.addAll(arrlstStudent2);
        for (Student student : arrlstStudent1) {
            System.out.println(student.getTenSV() + student.getMonSV());
        }
        //Sắp xếp có 2 cách
//        Collections.sort(arrlstStudent1);Không sử dụng được cáhc này vì không xác định được trường cần sắp xêp theo gì?
        //Collections.sort(arrlstStudent1);//Sử dụng được là vì sử dụng bên class có kể thừa hàm sắp xêp
        Collections.sort(arrlstStudent1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //return o1.getTenSV().compareTo(o2.getTenSV());//săp xếp xuôi
                // return -o1.getTenSV().compareTo(o2.getTenSV());//
                if (o1.getTuoiSV() > o2.getTuoiSV()) {
                    return -1;
                } else if (o1.getTuoiSV() < o2.getTuoiSV()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Sau khi sắp xếp");
        for (Student student : arrlstStudent1) {
            System.out.println(student.getTenSV() + student.getMonSV() + student.getTuoiSV());
        }

        System.out.println("--------------");
        Student student1a = new Student("A", "JAVA1", 20);
        Student student2b = new Student("B", "JAVA1", 21);
        Student student3c = new Student("C", "JAVA1", 18);
        Student student4d = new Student("D", "JAVA1", 19);
        ArrayList<Student> arrlstStudent3 = new ArrayList<Student>();
        arrlstStudent3.add(student1a);
        arrlstStudent3.add(student2b);
        arrlstStudent3.add(student3c);
        arrlstStudent3.add(student4d);
        //sử dụng sắp xếp ngẫu nhiên các phần tử bên trong
        //Shuflte
        for (Student student : arrlstStudent3) {
            System.out.println(student.getTenSV() + student.getMonSV() + student.getTuoiSV());
        }
        //
        ArrayList<String> arrListString1 = new ArrayList<String>();
        arrListString1.add("Dũng");
        arrListString1.add("Duy Anh");
        ArrayList<String> arrListString2 = new ArrayList<String>();
        arrListString2.add("Dũng");
        arrListString2.add("Duy Anh");
        //arrListString1.addAll(arrListString2);
        arrListString1.retainAll(arrListString2);// Hiệu của 2 List chỉ giữ lại những phần tử giống nhau của 2 arrlist
        for (String x : arrListString1) {
            System.out.print(x + " | ");
        }

    }
}
