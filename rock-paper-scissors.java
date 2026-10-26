import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String[] array = {"rock","paper","scissors"};
        boolean isRunning = true;
            while(isRunning){
                int random = rand.nextInt(0,3);

                System.out.println("Enter your move (rock,paper,scissors): ");


                String userInput = scanner.next();
                switch (userInput) {
                    case "rock":
                        if (array[random].equals("rock")) {
                            System.out.println("Tie");
                            System.out.println("Computer's move : rock");
                        } else if (array[random].equals("paper")) {
                            System.out.println("you lose ");
                            System.out.println("Computer's move : paper");
                        } else if (array[random].equals("scissors")) {
                            System.out.println("you win ");
                            System.out.println("Computer's move : scissors");
                        }
                        break;
                    case "paper":
                        if (array[random].equals("rock")) {

                            System.out.println("you win ");
                            System.out.println("Computer's move : rock");
                        } else if (array[random].equals("paper")) {
                            System.out.println("Tie");
                            System.out.println("Computer's move : paper");
                        } else if (array[random].equals("scissors")) {
                            System.out.println("you lose ");
                            System.out.println("Computer's move : scissors");
                        }
                        break;
                    case "scissors":
                        if (array[random].equals("rock")) {
                            System.out.println("you lose ");

                            System.out.println("Computer's move : rock");
                        } else if (array[random].equals("paper")) {
                            System.out.println("you win ");
                            System.out.println("Computer's move : paper");
                        } else if (array[random].equals("scissors")) {
                            System.out.println("Tie");
                            System.out.println("Computer's move : scissors");
                        }
                        break;
                }
                System.out.println("Play again?(yes/no): ");
                userInput = scanner.next();
                if(userInput.equals("no")){
                    isRunning = false;
                }
            }



    }
}
