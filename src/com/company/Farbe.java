package com.company;

public enum Farbe {
    r(-1),
    y(1),
    g(2);

    private int value;

    Farbe(int v) {
        this.value = v;
    }

    public int getValue() {
        return value;
    }
}
