package com.mycompany.mavenproject2;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        double satis,ucret;
        DecimalFormat nf = new DecimalFormat("###,###.00");
        System.out.println("günlük kaç tane ürün satıyorsunuz? ");
        satis = giris.nextDouble();
        if (satis < 50){
            ucret = 15.0 + satis * 1.0;
        }
        else{
            ucret = 15.0 + 50 * 2.0 + (satis - 50) * 3.0;
        }
        System.out.println("günlük ücretiniz " + nf.format(ucret) + " tl");
    }
}
