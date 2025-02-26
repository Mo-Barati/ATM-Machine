import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterface{
    ATM atm = new ATM();

    Map<Double, String> statement = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Available balance: " + atm.getBalance());
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= atm.getBalance()) {
            statement.put(amount, " Amount to withdraw");
            System.out.println("Withdraw money: " + amount);
            atm.setBalance(atm.getBalance() - amount);
            viewBalance();
        } else {
            System.out.println("Insufficient balance");
        }

    }

    @Override
    public void depositMoney(double amount) {
        statement.put(amount, " Amount to deposit");
        System.out.println(amount + " has been deposited");
        atm.setBalance(atm.getBalance() + amount);
        viewBalance();
    }

    @Override
    public void viewStatement() {
        for (Map.Entry<Double, String> entry : statement.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
