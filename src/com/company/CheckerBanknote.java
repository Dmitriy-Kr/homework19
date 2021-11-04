package com.company;

public abstract class CheckerBanknote implements BaseChecker {
    private CheckerBanknote nextChecker;
    private Banknote banknote;
    private int amountOfBanknotesInATM;

    public CheckerBanknote(Banknote banknote, int amountOfBanknotesInATM) {
        this.banknote = banknote;
        this.amountOfBanknotesInATM = amountOfBanknotesInATM;
    }

    public CheckerBanknote setNextChecker(CheckerBanknote nextChecker) {
        return this.nextChecker = nextChecker;
    }

    @Override
    public void check(int someMoney) {
        int exceeding = 0;
        int amount = someMoney / banknote.getValue();
        if (amount > amountOfBanknotesInATM) {
            exceeding = (amount - amountOfBanknotesInATM) * banknote.getValue();
            amount = amountOfBanknotesInATM;
        }
        int remainder = someMoney % banknote.getValue() + exceeding;
        if (amount > 0) {
            giveMoney(amount);
        }
        if (remainder > 0 && nextChecker != null) {
            nextChecker.check(remainder);
        }
    }

    protected abstract void giveMoney(int amount);
}
