package com.company;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        /*
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.

         */

        double mesafe,ucret;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen gidilen mesafeyi km olarak yazınız.");
        mesafe = scanner.nextDouble();

        ucret = mesafe * 2.20 + 10;
        if (ucret < 20){
            System.out.println("ucret= " + 20 + "lira");
        }else{
            System.out.println("ücret=" + ucret);
        }





    }
}
