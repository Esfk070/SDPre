import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.print("What is your first name?");
    String fname = keyboard.nextLine();

    System.out.print("What is your last name?");
    String lname = keyboard.nextLine();

    System.out.print("What is your favorite animal?");
    String favoriteAnimal = keyboard.nextLine();

    System.out.print("What is your favorite food?");
    String favoriteFood = keyboard.nextLine();

    System.out.print("What is your favorite song?");
    String favoriteSong = keyboard.nextLine();

    System.out.println("My name is " + fname + " " + lname + ".");

    System.out.println("My favourite animal is the " + favoriteAnimal + ".");

    System.out.println("My Favourite food is " + favoriteFood + ".");

    System.out.println("My Favourite song is " + favoriteSong + ".");




    //TODO prompt the user to get input for all of the String variables.

    //TODO print the output formatted to look like the expected output using String concatenation.

  }
}