package com.havelsan.havelsan_udm.model;


import lombok.Data;

@Data
public class AuthenticationInfoRequest {
    private String supportedFeatures;// Cardinality  0..1
    private String servingNetworkName;// Cardinality 1
    private ResynchronizationInfo resynchronizationInfo;// Cardinality 0..1
    private String ausfInstanceId;// Cardinality 1

}
