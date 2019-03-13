package com.havelsan.havelsan_udm.model;

import lombok.Data;

@Data
public class AuthenticationInfoResult {
    private  AuthType authType;
    private AuthenticationVector authenticationVector;
    private String supportedFeatures;
    private String supi;


}
