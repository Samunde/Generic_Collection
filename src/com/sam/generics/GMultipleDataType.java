package com.sam.generics;

public class GMultipleDataType  <Datatypeone, DatatypeTwo, DatatypeThree>  {
    Datatypeone valueOne;
    DatatypeTwo valueTwo;
    DatatypeThree valueThree;
    public GMultipleDataType() {
        System.out.println("GMultipleDataType Constructor with empty parameters") ;
    }

    public GMultipleDataType(Datatypeone v1, DatatypeTwo v2, DatatypeThree v3)
    {
        this.valueOne = v1;
        this.valueTwo = v2;
        this.valueThree = v3;
    }

    public Datatypeone getValueOne() {
        return valueOne;
    }

    public void setValueOne(Datatypeone valueOne) {
        this.valueOne = valueOne;
    }

    public DatatypeTwo getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(DatatypeTwo valueTwo) {
        this.valueTwo = valueTwo;
    }
    public DatatypeThree getValueThree() {
        return valueThree;
    }
    public void setValueThree(DatatypeThree valueThree) {
        this.valueThree = valueThree;
    }

    @Override
    public String toString() {
        return "GMultipleDataType{" +
                "valueOne=" + valueOne +
                ", valueTwo=" + valueTwo +
                ", valueThree=" + valueThree +
                '}';
    }
}



