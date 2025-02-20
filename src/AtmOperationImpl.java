public class AtmOperationImpl implements AtmOperationInterface{
    ATM atm = new ATM();

    @Override
    public void viewBalance() {
        System.out.println("Available balance: " + atm.getBalance());
    }

    @Override
    public void withdrawMoney(double amount) {

    }

    @Override
    public void depositMoney(double amount) {
        System.out.println(amount + " has been deposited");
        atm.setBalance(atm.getBalance() + amount);
        viewBalance();
    }

    @Override
    public void viewStatement() {

    }
}
