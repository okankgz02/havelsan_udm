package com.havelsan.havelsan_udm.exception.myexception;

import java.io.IOException;
import java.io.InvalidClassException;

public class myexception {

    public static void mekan(int yas) {

        if (yas < 18) {
            throw new InvalidAgeException("invalid age hatası");  //bu fonksiyonu cagırdıgımız yerde try catch içinde yazmamız gekeir

        } else {
            System.out.println("Giriş basarılı");
        }

    }

    public static void main(String[] args) {


        try {
            mekan(17);  //try catch içinde yazmaz isek throws ile fırlatırız main fonksiyonun devamına yazılır.
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }

    }
}
