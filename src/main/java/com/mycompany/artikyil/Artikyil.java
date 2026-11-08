/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.artikyil;
import  java.util.Scanner;
/**
 *
 * @author emirh
 */
public class Artikyil {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);   
        System.out.println("yilinizi girin");
    int yil=sc.nextInt();
        if (yil%4==0) {
            System.out.println("yiliniz artik yil");    
        } else {System.out.println("yiliniz artik degil");
        }
    
    
    
    
    
    }
}
