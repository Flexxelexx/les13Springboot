package com.example.demo.Dtos;

import com.example.demo.models.RemoteController;

public class RemoteControllerDTO {

    private String compatibleWith;
    private String batterytype;
    private String name;
    private String brand;

    private double price;

    private Integer originalStock;

    public static RemoteControllerDTO fromRemoteController (RemoteController remoteController) {

        RemoteControllerDTO dto = new RemoteControllerDTO();

        dto.setCompatibleWith(remoteController.getCompatibleWith());
        dto.setBatterytype(remoteController.getBatterytype());
        dto.setName(remoteController.getName());
        dto.setBrand(remoteController.getBrand());

        return dto;
    }

    public RemoteController toRemoteController() {

        RemoteController remoteController = new RemoteController();

        remoteController.setCompatibleWith(this.getCompatibleWith());
        remoteController.setBatterytype(this.getBatterytype());
        remoteController.setName(this.getName());
        remoteController.setBrand(this.getBrand());

        return remoteController;
    }

    public String getCompatibleWith() {
        return compatibleWith;
    }

    public void setCompatibleWith(String compatibleWith) {
        this.compatibleWith = compatibleWith;
    }

    public String getBatterytype() {
        return batterytype;
    }

    public void setBatterytype(String batterytype) {
        this.batterytype = batterytype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getOriginalStock() {
        return originalStock;
    }

    public void setOriginalStock(Integer originalStock) {
        this.originalStock = originalStock;
    }
}
