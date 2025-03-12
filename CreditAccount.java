
class CreditAccount extends Account{
    private long creditLimit;

    public CreditAccount(long creditLimit){
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long amount) {
        if (amount > 0){
            balance += amount;
            return true;
        } else return false;
    }

    @Override
    public boolean pay(long amount) {
        if (amount > 0 && (balance + creditLimit) >= amount){
            balance -= amount;
            return true;
        } else return false;
    }

}
