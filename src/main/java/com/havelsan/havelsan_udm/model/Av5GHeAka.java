package com.havelsan.havelsan_udm.model;

import lombok.Data;

@Data
public class Av5GHeAka {
    private AvType avType;//Cardinality 1
    private String rand;//Cardinality 1,pattern: "[A-Fa-f0-9]{32}"
    private String xresStar;//Cardinality 1,pattern: "[A-Fa-f0-9]{32}"
    private String autn;//Cardinality 1,pattern: "[A-Fa-f0-9]{32}"
    private String kausf;//Cardinality 1,pattern: "[A-Fa-f0-9]{64}"

}
