package org.example;

public enum Coin {
    PENNY(1),
    NICKER(5),
    DIME(10),
    QUARTER(25);

    public int value;

    Coin(int i) {
        this.value = i;
    }
}
