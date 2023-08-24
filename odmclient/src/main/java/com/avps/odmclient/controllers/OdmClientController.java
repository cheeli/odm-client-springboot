package com.avps.odmclient.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class OdmClientController{

    @GetMapping(value = "/testEndPoint")
    public String getResponse() {
        return "This is the first controller.aa..";
        
    }
}

 