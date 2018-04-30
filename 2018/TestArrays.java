/*
  Author: Sina
  
  Play around with the basics of an 
  array.
  
*/

public class TestArrays{
  
  //entry point of the program
  public static void main(String[] args){
    
    System.out.println(args[0]);
    
    //declare and initialize an array
    int[] arr = {3 ,5, 2, 3, 0};

    //another way to declare/init an array
    String[] words = new String[5];
    
    //assigning an index a value -- updating 
    words[0] = "cat";
    words[1] = "dog";
    words[4] = "pig";
    
    //access element by index and print
    System.out.println(arr[0]);
    System.out.println(words[2]);
    
    System.out.println("Printing array with loop...");
    
    //loop through array to print
    // i++ ---> i = i + 1
    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
    

    
  }//end of main
  
}//end class