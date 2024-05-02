package com.sam.generics;

public interface Movable <T>{

    public void move(T t,String locationCode);

    T getItemBeingMoved();
    String getLocationBeingMoved();
}
