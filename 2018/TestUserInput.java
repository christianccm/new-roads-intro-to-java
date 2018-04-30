
import java.util.Scanner;

public class TestUserInput{
  
  //main method - the start the program
  public static void main(String[] args){
    
    //for user input
    Scanner input = new Scanner(System.in);
    
    //prompt the user for their name
    System.out.println("What's your name?");
    
    //set up the name variable for user input
    String name = input.next();
    
    //print out the name
    System.out.println("Hello, " + name);
  }
  
}//end of class