<<<<<<< HEAD
import java.util.Scanner;

=======
>>>>>>> origin/master
public class MainClass {

    public static void main(String[] args) {

<<<<<<< HEAD
        int atmnumber = 12345;
        int atmpin = 123;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter atm number: ");
        int atmNumber = input.nextInt();
        System.out.print("Enter atm pin: ");
        atmpin = input.nextInt();
        if((atmnumber == atmNumber) && (atmpin == atmpin)) {
            while (true){
                System.out.println("1. View Available Balance \n2. Withdraw Balance \n3. Deposit\n4. View Statement \n5. Exit");
            }
        }
        else {
            System.out.println("You have entered the different atm number");
            System.exit(0);
        }
    }
}
