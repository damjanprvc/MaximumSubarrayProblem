package com.company;

public enum Color {
    r(-1),
    y(1),
    g(2);

    private int value;

    Color(int v) {
        this.value = v;
    }

    public int getValue() {
        return value;
    }
}
