/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai10_XuLyChuoi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S2_BieuThucChinhQuy {

    //Biểu thức chính quy
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Kiểm tra được khi nào người dùng nhập ký từ thì báo đúng là họ đang nhập ký tự và chữ cũng tưng tựj
        String input;
        do {
            System.out.println("Mời bạn nhập số nguyên vào chương trình: ");
            input = sc.nextLine();
            if (checkSo(input)) {
                System.out.println("Chúc mừng bạn đã hiểu đề bài");
            } else if (checkChu(input)) {
                System.out.println("Bạn đừng nhập chữ nữa");
            } else {
                System.out.println("Bạn đừng nhập ký tự nữa");
            }

        } while (!checkSo(input));

    }

    static boolean checkSo(String kieudulieu) {
        Pattern pattern = Pattern.compile("\\d+");//"\\d+" được gọi là Regex  ở đây nếu
        //Nếu sử dụng \\d thì có nghĩa chỉ muốn kiểm tra 1 ký tự
        //Nếu sử dụng \\d+ thì có nghĩa  muốn kiểm tra nhiều ký tự khi nhập vào
        Matcher matcher = pattern.matcher(kieudulieu);
        return matcher.matches();//Sẽ trả ra true nếu truyền vào là chữ và ngược lại
    }

    static boolean checkChu(String kieudulieu) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(kieudulieu);
        return matcher.matches();//Sẽ trả ra true nếu truyền vào là chữ và ngược lại
    }

}
