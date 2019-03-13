package com.havelsan.havelsan_udm.exception;

import java.io.IOException;

public class throw_exception_3 {
    public static void mekan(int yas) throws  IOException  {

        if (yas < 18) {
            throw new IOException(); // Checked yapıda kullanırsak anahtar kelime ister..EK olarak throws IOException kullanıırız.
           // throw  new ArithmeticException(); //bu unchecked oldugu için hata vermez ek anahtar kelime istemez
        }

    }

    //throws anahtar kelimesi check durumlarda gerekli.Diğer durumlarda kullansakda olur kullanmasakda olur.
    public static void main(String[] args) {

          //  mekan(17); // fonksiyon da bu olmasından dolayı IOException fırlattık .Yada try catch içinde de yazarız

        try {
            mekan(17);  //try catch içinde yazmaz isek throws ile fırlatırız main fonksiyonun devamına yazılır.
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

