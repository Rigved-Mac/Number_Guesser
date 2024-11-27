package codes;

import java.util.Scanner;
import java.util.Random;
public class Guess_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("\nWELCOME to the Number Guessing Game ;)");
        System.out.println("You have to choose a number between 1 to 100");
        System.out.println("Choose the difficulty level: \n1.Easy(10 chances) \n2.Medium(5 chances) \n3.Hard(3 chances) \n");
        int i1 = sc.nextInt();



        int chances = 0;
        if (i1 == 1) {
            chances = 10;
        } else if (i1 == 2) {
            chances = 5;
        } else if (i1 == 3) {
            chances = 3;
        } else {
            System.out.println("Invalid choice! \nPlease Restart!!!");
            System.exit(0);
        }



        int random_number = random.nextInt(100)+1;
        while (chances>=0) {
                if(chances == 0) { //LOSING STATEMENT.
                    System.out.println("YOU LOST :( \nRESTART THE GAME !!!");
                    System.exit(0);
                } else {
                    System.out.println("Enter your Guess: ");
                    int guess = sc.nextInt();
                    if(guess < random_number) {
                        System.out.println("LOW Guess\n");
                        chances--;
                    } else if(guess > random_number) {
                        System.out.println("HIGH Guess\n");
                        chances--;
                    } else {
                        System.out.println("\nCONGRATULATIONS  YOU WON !!!");
                        System.out.println("\uD83D\uDE1A\uD83D\uDE1A\uD83D\uDE1A");
                        System.exit(0);     //EXITS the code if Lost.
                    }
                }
            }
        System.out.println("THANK YOU :)");
        }
    }