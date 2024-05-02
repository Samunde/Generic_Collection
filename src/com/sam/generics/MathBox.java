package com.sam.generics;

import java.util.ArrayList;

public class MathBox <E extends Number > {
    private E data;
    public MathBox(E data) {
        this.data = data;
    }
    public double sqrt() {
        return Math.sqrt(this.data.doubleValue());
    }
}
