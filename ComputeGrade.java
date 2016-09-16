import java.util.Scanner;
public class ComputeGrade{

  public static void main(String[] args){
  
    //setup scanner
    Scanner input = new Scanner(System.in);
    
    //prompt for name
    System.out.println("Student's name: ");
    
    //get name
    String name = input.next();
    
    //prompt user for grades
    System.out.println("Enter grade for test 1: ");
    
    //get grades
    double grade1 = input.nextDouble();
    
     //prompt user for grades
    System.out.println("Enter grade for test 2: ");
    
    //get grades
    double grade2 = input.nextDouble();
    
     //prompt user for grades
    System.out.println("Enter grade for test 3: ");
    
    //get grades
    double grade3 = input.nextDouble();
    
    //find average
    double average = (grade1 + grade2 + grade3) / 3;
    
    String finalGrade = name + "'s final grade is " 
      + getLetterGrade(average);
    

    
    System.out.println(finalGrade);
    
    //print out letter grade
  }//end of method
  public static char getLetterGrade(double average){
        //figure out letter grades
    if(average >= 90){
      return 'A';
    }
    else if(average < 90 && average >= 80){
      return 'B';
    }
    else if (average < 80 && average >= 70){
      return 'C';
    }
    else if (average < 70 && average >= 65){
      return 'D';
    }
    return 'F';
    }
    
  }
//end of class