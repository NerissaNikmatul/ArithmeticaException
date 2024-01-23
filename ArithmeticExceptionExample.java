/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO;

/**
 *
 * @author HP
 */
public class ArithmeticExceptionExample {
        public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Hasil pembagian: " + result);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Kesalahan: Pembagian dengan nol tidak diizinkan.");
        }
    }
}
