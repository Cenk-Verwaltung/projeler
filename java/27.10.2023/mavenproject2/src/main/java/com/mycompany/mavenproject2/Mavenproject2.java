package com.mycompany.mavenproject2;
import java.util.Scanner;
public class Mavenproject2 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        double sayi;
        System.out.println("karekök bulmak için sayı giriniz");
        sayi = giris.nextDouble();
        if(sayi<0)
            System.out.println("0 dan büyük sayı giriniz");
        else
            System.out.println(sayi+"'nın karekökü " + Math.sqrt(sayi));
    }
}
