package com.havelsan.havelsan_udm.controller;

import com.havelsan.havelsan_udm.model.*;
import org.springframework.web.bind.annotation.*;

//Resource URI: {apiRoot}/nudm-ueau/v1/{supi}/auth-events

@RestController
@RequestMapping("nudm-ueau/v1/")
public class UdmController {


    //Supi or suci = 33246514819719
    //  @RequestMapping("/{supiOrSuci}/security-information/generate-auth-data")

    @PostMapping("/{supiOrSuci}/security-information/generate-auth-data")
    public AuthenticationInfoResult demo(@PathVariable String supiOrSuci , @RequestBody AuthenticationInfoRequest authenticationInfoRequest){

        AuthenticationInfoResult authenticationInfoResult = new AuthenticationInfoResult();
        authenticationInfoResult.setAuthType(AuthType.EAP_AKA_PRIME);
        AuthenticationVector authenticationVector = new AuthenticationVector();
        AvEapAkaPrime avEapAkaPrime = new AvEapAkaPrime();
        avEapAkaPrime.setAutn("advafgas");
        avEapAkaPrime.setAvTypeAvType(AvType.EAP_AKA_PRIME);
        avEapAkaPrime.setCkPrime("ckprime");
        avEapAkaPrime.setIkPrime("ikprime");
        avEapAkaPrime.setRand("rand");
        avEapAkaPrime.setXres("xres");
        authenticationVector.setAvEapAkaPrime(avEapAkaPrime);
        authenticationInfoResult.setAuthenticationVector(authenticationVector);
        authenticationInfoResult.setSupi(supiOrSuci);
        authenticationInfoResult.setSupportedFeatures("supportedfeatures");

    return authenticationInfoResult;
    }



}
/*

    private  AuthType authType;
    private AuthenticationVector authenticationVector;
    private String supi;

    private String supportedFeatures;//


     */


/*
  servingNetworkName: 5G
  rand : F2b7E27a7d9B5dBBE5e4C5925CbBd0b3
  auts : F2b7E27a7d9B5dBBE5e4C5925CbBd0b3
*/