package com.example.demo.Dtos;

import com.example.demo.models.CiModule;

public class CiModuleDTO {


    private Long id;

    private String name;
    private String type;

    private double price;

    public static CiModuleDTO fromCiModule (CiModule ciModule) {

        CiModuleDTO dto = new CiModuleDTO();

        dto.setName(ciModule.getName());
        dto.setType(ciModule.getType());
        dto.setPrice(ciModule.getPrice());

        return dto;
    }

    public CiModule toCiModule() {

        CiModule ciModule = new CiModule();

        ciModule.setName(this.getName());
        ciModule.setType(this.getType());
        ciModule.setPrice(ciModule.getPrice());

        return ciModule;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
