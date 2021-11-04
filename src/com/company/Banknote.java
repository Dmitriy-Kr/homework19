package com.company;

public enum Banknote {
    _50_GRN(50),
    _100_GRN(100),
    _200_GRN(200),
    _500_GRN(500),
    _1000_GRN(1000);

    private int value;

    Banknote(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
