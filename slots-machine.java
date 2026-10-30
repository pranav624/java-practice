import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //declare variable
        double balance = 100;
        int bet = 0;
        double amount = 0;
        double payout = 0;
        boolean isRunning = true;
        char userInput;
        String[] row = new String[3];

        //print welcome message
        System.out.println("************************");
        System.out.println("Welcome to Slot Machine");
        System.out.println("************************");

        //check balance if >0
        while(isRunning){
            if(balance > 0){
                System.out.printf("Balance: %f\n",balance);
                System.out.printf("Place your bet amount: ");
                bet = scanner.nextInt();
                if(bet>0){
                    //spin the 3 slots and display
                    System.out.println("spinning...");
                    row = spinRow();
                    payout = getPayout(row,bet);
                    if(payout > 0){
                        balance+=payout;
                        System.out.println("You won $" + payout);
                    }else{
                        System.out.println("You lost this round");
                        System.out.println("you want to quit? (Y/N): ");
                        userInput = scanner.next().charAt(0);
                        if(userInput == 'Y'){
                            isRunning = false;
                        }
                    }




                }else{
                    System.out.println("enter a valid amount!");
                }
            }else{
                System.out.println("Not enough balance!");
                System.out.printf("Enter amount : ");
                amount = scanner.nextDouble();
                balance +=amount;
            }
        }





        //    if two symbols match then add it to your account
    }
    static String[] spinRow() {
        Random rand = new Random();
        int random = -1;
        String[] symbols = {"🍒","🍉","🍋","🔔","⭐️"};
        String[] row = new String[3];
        //i want to display random symbols in 3 different boxes and return it
        System.out.println("**************");
        for(int i = 0 ; i<3 ; i++){
            random = rand.nextInt(0,5);
            row[i] = symbols[random];

            if(i<2){
                System.out.printf(" %s |",symbols[random]);
            }else{
                System.out.printf(" %s\n",symbols[random]);
            }

        }
        System.out.println("**************");
        return row;
    }
    static int getPayout(String[] row,int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐️" -> bet * 20;
                default -> 0;
            };
        }else if(row[0].equals(row[1])){
            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐️" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch(row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐️" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}
