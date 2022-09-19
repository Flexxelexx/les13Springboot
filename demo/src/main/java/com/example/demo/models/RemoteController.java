package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class RemoteController {

    @Id
    @GeneratedValue

    private Long id;

    private String compatibleWith;
    private String batterytype;
    private String name;
    private String brand;

    private double price;

    private Integer originalStock;

    @OneToOne (mappedBy = "remoteController")
    Television television;

    public RemoteController() {

    }


    public RemoteController(Long id, String compatibleWith, String batterytype, String name, String brand, double price, Integer originalStock) {
        this.id = id;
        this.compatibleWith = compatibleWith;
        this.batterytype = batterytype;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.originalStock = originalStock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Television getTelevision() {
        return television;
    }

    public void setTelevision(Television television) {
        this.television = television;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoteController that = (RemoteController) o;

        if (Double.compare(that.price, price) != 0) return false;
        if (!id.equals(that.id)) return false;
        if (!compatibleWith.equals(that.compatibleWith)) return false;
        if (!batterytype.equals(that.batterytype)) return false;
        if (!name.equals(that.name)) return false;
        if (!brand.equals(that.brand)) return false;
        return originalStock.equals(that.originalStock);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id.hashCode();
        result = 31 * result + compatibleWith.hashCode();
        result = 31 * result + batterytype.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + brand.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + originalStock.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "RemoteController{" +
                "id=" + id +
                ", compatibleWith='" + compatibleWith + '\'' +
                ", batterytype='" + batterytype + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", originalStock=" + originalStock +
                '}';
    }
}
