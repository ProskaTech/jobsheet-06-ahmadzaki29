/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 *  Created by Ahmad Zaki Alfaruq_21343079
 */
import javax.swing.JOptionPane;

public class tugas2A {
    public static void main(String[]args){
        String angka ="";
        angka = JOptionPane.showInputDialog("Silahkan masukkan angka ");
        int a = Integer.valueOf(angka).intValue();
   
        String hasil ="";
        if (a >= 1 && a <= 10){
            hasil += "Valid number";
        }
        else{
            hasil += "Invalid Number";
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
