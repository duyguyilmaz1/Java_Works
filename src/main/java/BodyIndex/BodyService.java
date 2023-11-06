package BodyIndex;

import java.util.Scanner;

public class BodyService {
    public static void showMenu(){

        Body body1= new Body();

        Scanner input= new Scanner(System.in);

        System.out.println("* Vucüt Kitle İndeksi Hesaplama *");

        System.out.println("Lütfen boyunuzu giriniz (Örnek 1,80): ");
        double height= input.nextDouble();
        if (height<=0){
            System.out.println("Geçerli bir sayı giriniz");
        }else body1.setHeight(height);

        System.out.println("Lütfen kilonuzu giriniz: ");
        double weight= input.nextDouble();
        if (weight<10){
            System.out.println("Geçerli bir sayı giriniz");
        } else body1.setWeight(weight);

        double vki= weight /(height*height);
        System.out.printf("Vücut Kitle Endeksiniz: " + "%.2f%n",vki);

        if (vki<16){
            System.out.println("Çok Zayıf");
        }else if (vki>=16 && vki<18){
            System.out.println("Zayıf");
        }else if (vki>=18 && vki<25){
            System.out.println("Normal");
        }else if (vki>=25 && vki<30){
            System.out.println("Fazla kilolu");
        }else if (vki>=30){
            System.out.println("Obez");
        }

    }
}
