package com.havelsan.havelsan_udm.model;

import java.io.Serializable;

public enum AuthType implements Serializable {
    EAP_AKA_PRIME("EAP_AKA_PRIME"),
    FIVEG_AKA ("5G_AKA"),
    EAP_TLS("EAP_TLS");

    private final String authType;

    AuthType(String authType) {
        this.authType = authType;
    }

    public String getAuthType() {
        return this.authType;
    }

}