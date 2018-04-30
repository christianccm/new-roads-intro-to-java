/*
  Author: Sina
  
  Purpose: Test output and input.
  
*/

import java.util.Scanner; //used for user-input

public class HelloWorld{
  
  //entry point of program
  public static void main(String[] args){
    
    /*
      Datatypes:
      int - 3, 100, -33, 
      double - 2.3, 0.333, 
      char - 'x', '1', '!'
      boolean - true/false
      String - "word", "cat", "slkdjfalskd!"
    */
    //declare all variables
    String word = "Hello World!";
    Scanner input = new Scanner(System.in);
    String name = "";
    
    //output Hello World!
    System.out.println(word);
    
    //prompt the user
    System.out.println("What is your name?");
    
    //get user input
    name = input.next();
    
    /*
      name.length() //get how many characters in String
      == //is equal to
      >
      <
      >=
      <=
    */
    if(){
      
    }
    
    /*
      To get other datatypes with Scanner:
      .next() - to get a String
      .nextInt() - to get int
      .nextDouble() - to get double
    */
    
    //output what user typed in
    System.out.println("Hello " + name);
    
  }//end main
  
}//end class