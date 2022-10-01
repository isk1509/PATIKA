package com.company;

import java.util.Scanner;

public class NotOrtHesap {

    public static void main(String[] args) {

        /*  Not Ortalaması Hesaplayan Program
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

        Ödev
        Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

        Not : If ve Else kullanılmayacak... */

        Scanner scanner = new Scanner(System.in);

        int m,f,k,tr,ta,mu,ortalama ;

        System.out.println("************************************************************");

        System.out.println("Lütfen matematik sınav sonucunu giriniz: ");
        m = scanner.nextInt();

        System.out.println("Lütfen fizik sınav sonucunu giriniz: ");
        f = scanner.nextInt();

        System.out.println("Lütfen kimya sınav sonucunu giriniz: ");
        k = scanner.nextInt();

        System.out.println("Lütfen türkçe sınav sonucunu giriniz:");
        tr = scanner.nextInt();

        System.out.println("Lütfen tarih sınav sonucunu giriniz: ");
        ta= scanner.nextInt();

        System.out.println("Lütfen müzik sınav sonucunu giriniz: ");
        mu= scanner.nextInt();

        ortalama = (m+f+k+tr+ta+mu) / 6;

        System.out.println("Puan ortalamanız: " + ortalama);

        String mesaj = ortalama > 60 ? "Geçtiniz" : "Kaldınız";

        System.out.println(mesaj);


        System.out.println("************************************************************");





    }
}
