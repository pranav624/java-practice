import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {"1. What is the main function of a router",
                    "2. Which part of the computer is considered the brain?",
                    "3. What year was Facebook launched",
                    "4. Who is known as the father of computers?",
                    "5. What was the first programming language"
        };
        String[][] options = {{"a. Storingfiles","b. Encrypting data","c. Directing internet traffic","d. managing passwords"},
                {"a. cpu","b. hdd","c. ram","d. gpu"},
                {"a. 2000","b. 2004","c. 2006","d. 2008"},
                {"a. steve jobs","b. bill gates","c. alan turing ","d. chrles babage"},
                {"a. cobol","b. c","c. fortran","d. assembly"}};
        char[] answers = {'c','a','b','d','c'};
        int count = 0 ;
        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");
        for(int i = 0; i< questions.length ; i++){
            System.out.println(questions[i]);
            for(int j = 0 ; j< options[i].length ; j++){
                System.out.println(options[i][j]);

            }
            System.out.print("Your guess: ");
            char userInput = scanner.next().charAt(0);
            if(userInput == answers[i]){
                System.out.println("correct");
                count++;
            }else{
                System.out.println("wrong");
            }

        }
        System.out.printf("You got %d/5",count);
    }
}
