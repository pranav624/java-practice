import java.util.*;
public class Main{
    static double balance = 0;
    public static void main (String[] args) throws InterruptedException {
        Scanner scanner = new Scanner (System.in);
        boolean running = true;
        while(running){
            System.out.println("*******************");
            System.out.println("BANKING PROGRAM");
            System.out.println("*******************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*******************");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            if(choice == 1){
                showBalance();
            }else if(choice == 2) {
                System.out.println("Enter the amount to deposit: ");
                double amountDep = scanner.nextDouble();
                deposit(amountDep);
            }else if(choice == 3){
                System.out.println("Enter the amount to withdraw: ");
                double amountWith = scanner.nextDouble();
                withdraw(amountWith);
            }else if(choice == 4){
                running = false;
            }else{
                System.out.println("Choose a valid option!");
            }
        }



    }

    static void deposit(double amount) throws InterruptedException {
        if(amount<=0){
            System.out.println("amount is negative!");
        }else{
            balance += amount;
            System.out.printf("Deposited: $%.2f ",amount);
            showBalance();
        }

    }
    static void withdraw(double amount) throws InterruptedException {
        if(amount>balance){
            System.out.println("Not enough balance!");
        }else if(amount<=0){
            System.out.println("amount is negative!");
        }else {
            balance -= amount;
            System.out.printf("withdrawn: $%.2f ",amount);
            showBalance();
        }

    }
    static void showBalance() throws InterruptedException {
        Thread.sleep(1000);
        System.out.printf("Balance: $%.2f\n",balance);
        Thread.sleep(1000);
    }

}