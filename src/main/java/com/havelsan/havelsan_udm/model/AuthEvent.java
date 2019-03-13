package com.havelsan.havelsan_udm.model;

import lombok.Data;

@Data
public class AuthEvent {

    private String nfInstanceId; //Cardinality 1, uuid

    private boolean success; //Cardinality 1, true indicates success, false indicates no success
    private String  timeStamp;//Cardinality 1
    private String servingNetworkName;
    private AuthType authType; //Cardinality 1

}
