package com.coffeemetalcode.calcengine;

public class Adder extends CalculateBase {
    @Override
    public void calculate() {
        double value = getLeftVal() + getResult();
        setResult(value);
    }
}
