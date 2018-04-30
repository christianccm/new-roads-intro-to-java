/*
  Author: Sina
  
  Play around with Strings
  
*/

import java.util.Scanner;

public class TestStrings{
  
  //entry point of program
  public static void main(String[] args){
    
    //declare variables
    Scanner input = new Scanner(System.in);
    int num1 = 0;
    int num2 = 0;
    
    //prompt the user
    System.out.println("Please give two whole numbers...");
    
    //get user input and put into variables
    num1 = input.nextInt();
    num2 = input.nextInt();
    
    //Output the numbers given by user
    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);
    
  }//end of main
  
}//end of class