/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        // sinh viên code ở đây
          Scanner scanner = new Scanner(System.in);

        // Nhập họ và tên
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();

        // Nhập điểm trung bình
        System.out.print("Điểm TB: ");
        double diemTB = scanner.nextDouble();

        // Xuất kết quả ra màn hình
        System.out.printf("%s %.2f điểm\n", hoTen, diemTB);

    }
}
