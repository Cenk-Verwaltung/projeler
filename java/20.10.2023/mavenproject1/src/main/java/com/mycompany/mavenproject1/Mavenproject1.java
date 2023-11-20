package com.mycompany.mavenproject1;
import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        double x, f, g;
        System.out.println("bir sayı giriniz");
        x = giris.nextDouble();
        if(x>0.0){
            f = 1.0 / (1.0 + x );
            g = 1.0 / x;
        }
        else {
            f = 1.0 / (1.0 + x * x);
            g = 1.0 / (1.0 + x + x * x);
        }
        System.out.println("\nf(x)=" + f);
        System.out.println("\ng(x)=" + g);
    }
}
