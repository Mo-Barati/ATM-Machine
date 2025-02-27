
import java.util.Scanner;

public class MainClass{
    public static void main(String[] args) {

        AtmOperationInterface op = new AtmOperationImpl();

        int atmnumber = 12345;
        int atmpin = 123;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter atm number: ");
        int atmNumber = input.nextInt();
        System.out.print("Enter atm pin: ");
        atmpin = input.nextInt();
        if((atmnumber == atmNumber) && (atmpin == atmpin)) {
            while (true){
                System.out.println("1. View Available Balance \n2. Withdraw \n3. Deposit\n4. View Statement \n5. Exit");
                System.out.println("Enter your choice: ");
                int choice = input.nextInt();
                switch(choice) {
                    case 1:
                        op.viewBalance();
                        break;

                    case 2:
                        System.out.println("Enter amount to withdraw: ");
                        double withdraw = input.nextDouble();
                        op.withdrawMoney(withdraw);
                        break;


                    case 3:
                        System.out.println("Enter amount to deposit: ");
                        double amount = input.nextDouble();
                        op.depositMoney(amount);
                        break;

                    case 4:
                        op.viewStatement();
                        break;

                    case 5:
                        System.out.println("Collect your ATM Card \n Thank you for using ATM Machine.");
                        System.exit(0);
                }
            }
        }
        else {
            System.out.println("Please enter a valid number");
            System.exit(0);
        }
    }
}
