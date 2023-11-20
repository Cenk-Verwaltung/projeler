package com.mycompany.mavenproject3;
import java.util.Scanner;
public class Mavenproject3 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int yil,ay,gun;
        double y,a,g;
        
        System.out.println("doğum yılı? ");
        yil = giris.nextInt();
        System.out.println("doğum ayı? ");
        ay = giris.nextInt();
        System.out.println("doğum günü? ");
        gun = giris.nextInt();
        
        g = (((2023-yil)*365.25)+((10-ay)*30.4375)+(20-gun));
        System.out.println("yaşadığınız gün " + g);
        a = g / 30.4375;
        System.out.println("yaşadığınız ay " + a);
        y = a / 12;
        System.out.println("yaşadığınız yıl " + y);
         
        if((ay == 3 && gun >= 21) | (ay == 4 && gun <= 20)){
            System.out.println("Burcunuz koç");
        }
        else if((ay == 4 && gun >= 21) | (ay == 5 && gun <= 20)){
            System.out.println("Burcunuz boğa");
        }
        else if((ay == 5 && gun >= 21) | (ay == 6 && gun <= 21)){
            System.out.println("Burcunuz ikizler");
        }
        else if((ay == 6 && gun >= 22) | (ay == 7 && gun <= 22)){
            System.out.println("Burcunuz yengeç");
        }
        else if((ay == 7 && gun >= 23) | (ay == 8 && gun <= 23)){
            System.out.println("Burcunuz aslan");
        }
        else if((ay == 8 && gun >= 24) | (ay == 9 && gun <= 23)){
            System.out.println("Burcunuz başak");
        }
        else if((ay == 9 && gun >= 23) | (ay == 10 && gun <= 23)){
            System.out.println("Burcunuz terazi");
        }
        else if((ay == 10 && gun >= 24) | (ay == 11 && gun <= 22)){
            System.out.println("Burcunuz akrep");
        }
        else if((ay == 11 && gun >= 23) | (ay == 12 && gun <= 21)){
            System.out.println("Burcunuz yay");
        }
        else if((ay == 12 && gun >= 22) | (ay == 1 && gun <= 19)){
            System.out.println("Burcunuz oğlak");
        }
        else if((ay == 1 && gun >= 20) | (ay == 2 && gun <= 18)){
            System.out.println("Burcunuz kova");
        }
        else if((ay == 2 && gun >= 19) | (ay == 3 && gun <= 20)){
            System.out.println("Burcunuz balık");
        }
    }
}
