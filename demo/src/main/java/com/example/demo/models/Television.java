package com.example.demo.models;

import javax.persistence.*;

@Entity

public class Television {

    @Id
    @GeneratedValue

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


    @OneToOne
    RemoteController remoteController;

    public Television() {

    }

    public RemoteController getRemoteController() {
        return remoteController;
    }

    public void setRemoteController(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    public Television(Long id, String type, String brand, String name, String screenType, String screenQuality, double price, double availableSize, double refreshRate, boolean smartTv, boolean wifi, boolean voiceControl, boolean hdr, boolean bluetooth, boolean ambiLight, Integer originalStock, Integer sold) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.name = name;
        this.screenType = screenType;
        this.screenQuality = screenQuality;
        this.price = price;
        this.availableSize = availableSize;
        this.refreshRate = refreshRate;
        this.smartTv = smartTv;
        this.wifi = wifi;
        this.voiceControl = voiceControl;
        this.hdr = hdr;
        this.bluetooth = bluetooth;
        this.ambiLight = ambiLight;
        this.originalStock = originalStock;
        this.sold = sold;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Television that = (Television) o;

        if (Double.compare(that.price, price) != 0) return false;
        if (Double.compare(that.availableSize, availableSize) != 0) return false;
        if (Double.compare(that.refreshRate, refreshRate) != 0) return false;
        if (smartTv != that.smartTv) return false;
        if (wifi != that.wifi) return false;
        if (voiceControl != that.voiceControl) return false;
        if (hdr != that.hdr) return false;
        if (bluetooth != that.bluetooth) return false;
        if (ambiLight != that.ambiLight) return false;
        if (!id.equals(that.id)) return false;
        if (!type.equals(that.type)) return false;
        if (!brand.equals(that.brand)) return false;
        if (!name.equals(that.name)) return false;
        if (!screenType.equals(that.screenType)) return false;
        if (!screenQuality.equals(that.screenQuality)) return false;
        if (!originalStock.equals(that.originalStock)) return false;
        return sold.equals(that.sold);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + brand.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + screenType.hashCode();
        result = 31 * result + screenQuality.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(availableSize);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(refreshRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (smartTv ? 1 : 0);
        result = 31 * result + (wifi ? 1 : 0);
        result = 31 * result + (voiceControl ? 1 : 0);
        result = 31 * result + (hdr ? 1 : 0);
        result = 31 * result + (bluetooth ? 1 : 0);
        result = 31 * result + (ambiLight ? 1 : 0);
        result = 31 * result + originalStock.hashCode();
        result = 31 * result + sold.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Television{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", screenType='" + screenType + '\'' +
                ", screenQuality='" + screenQuality + '\'' +
                ", price=" + price +
                ", availableSize=" + availableSize +
                ", refreshRate=" + refreshRate +
                ", smartTv=" + smartTv +
                ", wifi=" + wifi +
                ", voiceControl=" + voiceControl +
                ", hdr=" + hdr +
                ", bluetooth=" + bluetooth +
                ", ambiLight=" + ambiLight +
                ", originalStock=" + originalStock +
                ", sold=" + sold +
                '}';
    }
}
