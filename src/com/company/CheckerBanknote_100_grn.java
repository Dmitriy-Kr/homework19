package com.company;

public class CheckerBanknote_100_grn extends CheckerBanknote{

    public CheckerBanknote_100_grn() {
        super(Banknote._100_GRN,50);
    }

    @Override
    protected void giveMoney(int amount) {
        System.out.println("Купюры номиналом 100 грн: " + amount + " шт");
    }
}
