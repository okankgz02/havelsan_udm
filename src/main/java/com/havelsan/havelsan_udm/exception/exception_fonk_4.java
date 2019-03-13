package com.havelsan.havelsan_udm.exception;

public class exception_fonk_4 {

    // iç içe fonksiyonların stackteki durumu
    //stacke ilk main girer sonra birincif , sonra ikincif,sonra ,ucuncuf girer.Ve en tepede durur.Exception olarak
    //birşey olusturmazsak bunu bir altındaki ikincif ye bakar.burda da yoksa birincif yoksa mainde bakar

    /*
    * ucuncuf
    * ikincif
    * birincif
    * main
    *
    * Fonksiyonların stacktaki şekli şekildeki gibidir.
    * */
    public static void ucuncufonksiyon() {

        int a = 12 / 0;


    }

    public static void ikincifonksiyon() {

        ucuncufonksiyon();


    }
    public static void birincifonksiyon() {

        ikincifonksiyon();

    }
    public static void main(String[] args) {

        birincifonksiyon();


    }
}

