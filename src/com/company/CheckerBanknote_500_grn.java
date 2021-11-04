package com.company;

public class CheckerBanknote_500_grn extends CheckerBanknote{

    public CheckerBanknote_500_grn() {
        super(Banknote._500_GRN, 10);
    }

    @Override
    protected void giveMoney(int amount) {
        System.out.println("Купюры номиналом 500 грн: " + amount + " шт");
    }
}
