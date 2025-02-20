import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        int atmnumber = 12345;
        int atmpin = 123;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter atm number: ");
        int atmNumber = input.nextInt();
        System.out.print("Enter atm pin: ");
        atmpin = input.nextInt();
        if((atmnumber == atmNumber) && (atmpin == atmpin)) {
            System.out.println("You have entered the same atm number");
        }
        else {
            System.out.println("You have entered the different atm number");
            System.exit(0);
        }
    }
}
