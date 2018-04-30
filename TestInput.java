import java.util.ArrayList;
import java.util.Scanner;

public class TestInput{

  public static void main(String[] args){
    
    //declare to start getting user input
    Scanner scanner = new Scanner(System.in);
    
    //Prompt the user with a question to provide input
    System.out.println("Welcome");
    
    System.out.println("What's your name?");
    
    String name = scanner.next();
    
    System.out.println("Hi " + name + "!");
    
    System.out.println("How many ants do you want?");
    
    int numberOfAnts = scanner.nextInt();
    
    //declare a arraylist
    ArrayList<Ant> list = new ArrayList<>();
    
    //initialize a list of ants from user input
    for(int i = 0; i < numberOfAnts; i++){
      list.add(new Ant());
      list.get(i).setGender("female");
      list.get(i).setId(i);
    }
    
    System.out.println("Here is your list of ants...");
    
    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }
       
    //System.out.println(list.get(1));
    
  }
  
}