package com.example.demo.Dtos;

import com.example.demo.models.Television;

public class TelevisionDTO {


    private Long id;

    private String type;
    private String brand;
    private String name;
    private String screenType;
    private String screenQuality;

    private double price;
    private double availableSize;
    private double refreshRate;

    private boolean smartTv;
    private boolean wifi;
    private boolean voiceControl;
    private boolean hdr;
    private boolean bluetooth;
    private boolean ambiLight;

    private Integer originalStock;
    private Integer sold;

    public RemoteControllerDTO remoteControllerDTO;


    public static TelevisionDTO fromTelevision(Television television) {

        TelevisionDTO dto = new TelevisionDTO();

        dto.setType(television.getType());
        dto.setBrand(television.getBrand());
        dto.setName(television.getName());
        dto.setScreenType(television.getScreenType());
        dto.setScreenQuality(television.getScreenQuality());

        dto.setPrice(television.getPrice());
        dto.setAvailableSize(television.getAvailableSize());
        dto.setRefreshRate(television.getRefreshRate());

        dto.setSmartTv(television.isSmartTv());
        dto.setWifi(television.isWifi());
        dto.setVoiceControl(television.isVoiceControl());
        dto.setHdr(television.isHdr());
        dto.setBluetooth(television.isBluetooth());
        dto.setAmbiLight(television.isAmbiLight());

        dto.setOriginalStock(television.getOriginalStock());
        dto.setSold(television.getSold());

        return dto;
    }

    public Television toTelevision () {

        Television television= new Television();

        television.setType(this.getType());
        television.setBrand(this.getBrand());
        television.setName(this.getName());
        television.setScreenType(this.getScreenType());
        television.setScreenQuality(this.getScreenQuality());

        television.setPrice(this.getPrice());
        television.setAvailableSize(this.getAvailableSize());
        television.setRefreshRate(this.getRefreshRate());

        television.setSmartTv(this.isSmartTv());
        television.setWifi(this.isWifi());
        television.setVoiceControl(this.isVoiceControl());
        television.setHdr(this.isHdr());
        television.setBluetooth(this.isBluetooth());
        television.setAmbiLight(this.isAmbiLight());

        television.setOriginalStock(this.getOriginalStock());
        television.setSold(this.getSold());

        return television;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getScreenQuality() {
        return screenQuality;
    }

    public void setScreenQuality(String screenQuality) {
        this.screenQuality = screenQuality;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAvailableSize() {
        return availableSize;
    }

    public void setAvailableSize(double availableSize) {
        this.availableSize = availableSize;
    }

    public double getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(double refreshRate) {
        this.refreshRate = refreshRate;
    }

    public boolean isSmartTv() {
        return smartTv;
    }

    public void setSmartTv(boolean smartTv) {
        this.smartTv = smartTv;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isVoiceControl() {
        return voiceControl;
    }

    public void setVoiceControl(boolean voiceControl) {
        this.voiceControl = voiceControl;
    }

    public boolean isHdr() {
        return hdr;
    }

    public void setHdr(boolean hdr) {
        this.hdr = hdr;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean isAmbiLight() {
        return ambiLight;
    }

    public void setAmbiLight(boolean ambiLight) {
        this.ambiLight = ambiLight;
    }

    public Integer getOriginalStock() {
        return originalStock;
    }

    public void setOriginalStock(Integer originalStock) {
        this.originalStock = originalStock;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }


    public RemoteControllerDTO getRemoteControllerDTO() {
        return remoteControllerDTO;
    }

    public void setRemoteControllerDTO(RemoteControllerDTO remoteControllerDTO) {
        this.remoteControllerDTO = remoteControllerDTO;
    }
}
