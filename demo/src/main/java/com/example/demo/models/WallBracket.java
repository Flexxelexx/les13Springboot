package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class WallBracket {

    @Id
    @GeneratedValue


    private Long id;

    private String size;
    private String name;

    private double price;

    private boolean adjustable;

    public WallBracket() {

    }
    public WallBracket(Long id, String size, String name, double price, boolean adjustable) {
        this.id = id;
        this.size = size;
        this.name = name;
        this.price = price;
        this.adjustable = adjustable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAdjustable() {
        return adjustable;
    }

    public void setAdjustable(boolean adjustable) {
        this.adjustable = adjustable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WallBracket that = (WallBracket) o;

        if (Double.compare(that.price, price) != 0) return false;
        if (adjustable != that.adjustable) return false;
        if (!id.equals(that.id)) return false;
        if (!size.equals(that.size)) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id.hashCode();
        result = 31 * result + size.hashCode();
        result = 31 * result + name.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (adjustable ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "WallBracket{" +
                "id=" + id +
                ", size='" + size + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", adjustable=" + adjustable +
                '}';
    }
}
