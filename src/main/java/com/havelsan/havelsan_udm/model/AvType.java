package com.havelsan.havelsan_udm.model;

import java.io.Serializable;


public enum AvType implements Serializable {
    FIVEG_HE_AKA("5G_HE_AKA"),
    EAP_AKA_PRIME("EAP_AKA_PRIME");

    private final  String avType;

    AvType(String avType){
        this.avType=avType;
    }
    public String getAvType() {
        return this.avType;
    }

}
