package com.company;

public class CheckerBanknote_200_grn extends CheckerBanknote{

    public CheckerBanknote_200_grn() {
        super(Banknote._200_GRN, 25);
    }

    @Override
    protected void giveMoney(int amount) {
        System.out.println("Купюры номиналом 200 грн: " + amount + " шт");
    }
}
