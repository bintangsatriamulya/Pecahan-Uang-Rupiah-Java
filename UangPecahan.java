 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pecahan;

import java.util.Scanner;

/**
 *
 * @author Bintang Satria Mulya
 */
public class UangPecahan {
    public static void main(String[] args) {
        Scanner loli=new Scanner (System.in);
         int uang,sisa;
         
         int uangpch []={100000,50000,20000,10000,5000,2000,1000};
         
         System.out.println("===---->>>Menetukan Pecahan Uang Rupiah<<<----===");
         
         System.out.print("Masukan Uang Anda : ");
         uang=loli.nextInt();
         System.out.println("Uang Anda : "+uang);
         System.out.println("--------------------------------------------------");
         
         for (int i = 0; i < uangpch.length; i++) {
             if (uang/uangpch[i]!=0) {
                 System.out.println(uang/uangpch[i]+" lembar uang Rp "+uangpch[i]);
             }
//             else if (uang>1000) {
//                 System.out.println("Uang Anda Kurang");
//             }
             sisa=uang%uangpch[i];
             uang=sisa;
        }
         System.out.println(">>Terimakasih Onnichan<<");
    }
}
