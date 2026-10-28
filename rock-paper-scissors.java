import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String[] array = {"rock","paper","scissors"};
        boolean isRunning = true;
            while(isRunning){
                int random = rand.nextInt(0,3);

                System.out.print("Enter your move (rock,paper,scissors): ");


                String userInput = scanner.next().toLowerCase();


                    if(!userInput.equals("rock") && !userInput.equals("paper") && !userInput.equals("scissors")){
                        System.out.println("Enter a valid input");
                    }else if (array[random].equals(userInput)) {
                        System.out.println("Tie");
                        System.out.printf("Computer's move : %s\n",array[random]);
                    }else if(userInput.equals("rock") && array[random].equals("scissors")
                            || userInput.equals("paper")&& array[random].equals("rock")
                            || userInput.equals("scissors")&& array[random].equals("paper")){
                        System.out.println("you win ");
                        System.out.printf("Computer's move : %s\n",array[random]);
                    }else{
                        System.out.println("you lose ");
                        System.out.printf("Computer's move : %s\n",array[random]);
                    }

//
                System.out.println("Play again?(yes/no): ");
                userInput = scanner.next().toLowerCase();
                if(userInput.equals("no")){
                    isRunning = false;
                }
            }



    }
}
