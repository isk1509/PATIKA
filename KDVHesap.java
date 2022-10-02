package com.company;

import java.util.Scanner;

public class KDVHesap {

    /*  KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.  */

    public static void main(String[] args) {

        double  kdvFiyat, kdv, fiyat, kdvTutar;
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen fiyatı giriniz: ");
        fiyat = scanner.nextInt();

        if (fiyat > 0 && fiyat <= 1000){
            kdv = fiyat * 0.18;
            kdvFiyat = fiyat + kdv;
            kdvTutar = kdvFiyat - fiyat;


            System.out.println("--------------------------------");

            System.out.println("KDV'siz Fiyat = " + fiyat);
            System.out.println("KDV'li Fiyat = " + kdvFiyat);
            System.out.println("KDV Tutarı= " +kdvTutar);

            System.out.println("--------------------------------");
        }else if(fiyat >1000){
            kdv = fiyat * 0.08;
            kdvFiyat = fiyat + kdv;
            kdvTutar = kdvFiyat - fiyat;


            System.out.println("--------------------------------");

            System.out.println("KDV'siz Fiyat = " + fiyat);
            System.out.println("KDV'li Fiyat = " + kdvFiyat);
            System.out.println("KDV Tutarı= " +kdvTutar);
        }else{
            System.out.println("Yanlış değer girdiniz lütfen kontrol ediniz");
        }


    }



}
