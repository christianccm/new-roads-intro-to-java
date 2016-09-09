import java.util.Scanner;

//Christian's Test app
public class TestApp{

  //entry point for app
  public static void main(String[] args){
  
    //data types in java
    int num1 = 5;
    double num2 = 3.5;
    String world = "This is a string literal";
    char x = 'x';
    
    //create a program in 3 user inputs
    //and outputs the average to the screen 
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter three numbers: ");
    double num3 = input.nextDouble();
    double num4 = input.nextDouble();
    double num5 = input.nextDouble();
    
    System.out.println("The numbers you chose are "
        + num3 + " " + num4 + " " + num5);
    
    double sum = num3 + num4 + num5;
    double average = sum / 3;
    
    System.out.println("This is the average of your numbers "
                      + average);
    
    //this is a boolean
    boolean flag = false;
    
    //logical operators
    //examples - >, <, ==, <=, >=, !=
    
    if(average > 2){
      
      flag = true;
    }
    
    if (flag == true){
      System.out.println("Your average is greater than 2");
    }
   
    git add .
    git commit-m"Second commit"
    
  }
  
}