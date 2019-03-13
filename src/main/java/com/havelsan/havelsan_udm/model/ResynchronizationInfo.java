package com.havelsan.havelsan_udm.model;


import lombok.Data;

/**
 * @Standart : 3GPP TS 29.503 V15.1.0 (2018-10)
 * @Table 6.3.6.2.6-1
 * @Developer : Okan Akgöz
 */

@Data
public class ResynchronizationInfo {
    private String rand;//Cardinality 1, pattern: "[A-Fa-f0-9]{32}"
    private String auts;//Cardinality 1, pattern: "[A-Fa-f0-9]{28}"
}

