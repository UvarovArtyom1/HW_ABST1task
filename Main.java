public class Main {

    public static void main(String[] args) {
        SimpleAccount simpleAccount = new SimpleAccount();
        CreditAccount creditAccount = new CreditAccount(2000);

        simpleAccount.add(1000);
        simpleAccount.pay(800);
        System.out.println(simpleAccount.getBalance());

        System.out.println(creditAccount.transfer(simpleAccount, 5000));


    }
}
