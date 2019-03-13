package com.havelsan.havelsan_udm.exception.myexception;

import java.io.IOException;
import java.io.InvalidClassException;

public class myexception {

    public static void mekan(int yas) {

        if (yas < 18) {
            throw new InvalidAgeException("invalid age hatası mainden gönderilen");  //bu fonksiyonu cagırdıgımız yerde try catch içinde yazmamız gekeir
            //burdaki mesaj İnvalidAgeException içerisine gider.Ve ordan super metoduna  bir üsteki sınıfta cağrılır

        } else {
            System.out.println("Giriş basarılı");
        }

    }

    public static void main(String[] args) {


        try {
            mekan(17);  //try catch içinde yazmaz isek throws ile fırlatırız main fonksiyonun devamına yazılır.
        } catch (InvalidAgeException e) {
            System.out.println(e); //burda ise InvalidAgeExceptiondaki super metodu ile bir üst sınıfa gönderilen exceptiondur.
            e.printStackTrace(); //override edilen hatadır.
        }

    }
}
