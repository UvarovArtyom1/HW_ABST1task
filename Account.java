abstract class Account {
    protected long balance;

    public Account() {
        this.balance = 0;
    }

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    public boolean transfer(Account account, long amount) {
        if (pay(amount)) {
            return account.add(amount);
        }
        return false;
    }

    public long getBalance() {
        return balance;
    }
}