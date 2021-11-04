package com.company;

public class CheckerBanknote_1000_grn extends CheckerBanknote{

    public CheckerBanknote_1000_grn() {
        super(Banknote._1000_GRN, 5);
    }

    @Override
    protected void giveMoney(int amount) {
        System.out.println("Купюры номиналом 1000 грн: " + amount + " шт");
    }
}
