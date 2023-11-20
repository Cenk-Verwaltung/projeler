package com.mycompany.mavenproject3;
import java.util.Scanner;
public class Mavenproject3 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        String durum = null;
        double not1,not2,not3;
        float ort;
        
        System.out.println("1. notu giriniz");
        not1 = giris.nextDouble();
        System.out.println("2. notu giriniz");
        not2 = giris.nextDouble();
        System.out.println("3. notu giriniz");
        not3 = giris.nextDouble();
        
        ort = (float)(not1+not2+not3)/3;
        
        if(ort >= 85 && ort <= 100)
            durum = "takdir";
        if(ort >= 70 && ort <= 84)
            durum = "teşekkür";
        if(ort >= 50 && ort <= 69)
            durum = "geçti";
        if(ort >= 30 && ort <= 49)
            durum = "kaldı";
        if(ort >= 0 && ort <= 29)
            durum = "çöpe";
        
        System.out.println("Ortalamanız: " + ort);
        System.out.println("Durumu: " + durum);
    }
}
