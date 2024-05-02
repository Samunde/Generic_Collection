package com.sam.generics;

public class ProductItem <U> implements Movable<U>{

    private String locatin;
    private U item;

    @Override
    public void move(U t, String locationCode) {
        item = t;
        locatin = locationCode;
    }

    @Override
    public U getItemBeingMoved() {

        return item;
    }

    @Override
    public String getLocationBeingMoved() {
        return locatin;
    }
}
