package com.company;

public class CheckerBanknote_50_grn extends CheckerBanknote{

    public CheckerBanknote_50_grn() {
        super(Banknote._50_GRN, 100);
    }

    @Override
    protected void giveMoney(int amount) {
        System.out.println("Купюры номиналом 50 грн: " + amount + " шт");
    }
}
