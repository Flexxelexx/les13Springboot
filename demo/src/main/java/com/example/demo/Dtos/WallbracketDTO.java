package com.example.demo.Dtos;

import com.example.demo.models.WallBracket;

public class WallbracketDTO {


    private Long id;

    private String size;
    private String name;

    private double price;

    private boolean adjustable;



    public static WallbracketDTO fromWallbracket (WallBracket wallBracket) {

        WallbracketDTO dto = new WallbracketDTO();

        dto.setSize(wallBracket.getSize());
        dto.setName(wallBracket.getName());
        dto.setPrice(wallBracket.getPrice());
        dto.setAdjustable(wallBracket.isAdjustable());

        return dto;
    }

    public WallBracket toWallbracket() {

        WallBracket wallBracket = new WallBracket();

        wallBracket.setSize(this.getSize());
        wallBracket.setName(this.getName());
        wallBracket.setPrice(this.getPrice());
        wallBracket.setAdjustable(this.isAdjustable());

        return wallBracket;
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
}
