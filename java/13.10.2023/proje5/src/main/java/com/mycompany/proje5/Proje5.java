package com.mycompany.proje5;
import java.io.IOException;
import java.util.Scanner;
public class Proje5 {

    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int İstanbulPlakaKodu=34;
        int girilenPlakaKodu;
        System.out.println("istanbul un plaka kodu nedir?");
        girilenPlakaKodu=giris.nextInt();
        if (girilenPlakaKodu==İstanbulPlakaKodu) {
            System.out.println("evet doğru cevap");
        }
        else{
            System.out.println("hayır34 istanbulun plaka kodu 34");
        }
    }
}
