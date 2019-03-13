package com.havelsan.havelsan_udm.exception.myexception;

public class InvalidAgeException extends ArithmeticException {

    public InvalidAgeException(String message){
        super(message); //burda üsteki extend yapıya mesajı  iletiriz.
    }

    @Override
    public void printStackTrace() {
        System.out.println("İnvalidAge hatasıdır.");    }
}
