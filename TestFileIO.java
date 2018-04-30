/*
  Author: Sina
  
  Test how to read a file
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFileIO{
  
  //main method
  public static void main(String[] args){
    
    //declare variables and objects
    String currentLine;
    String filename = "Story.txt";
    
    //try reading a file
    try(BufferedReader br = new BufferedReader(new FileReader(filename))){
      
      //the logic to read the file
      while((currentLine = br.readLine()) != null){
        System.out.println(currentLine);
      }
      
      
    } catch(IOException e){
      e.printStackTrace();
    }
    
  }//end main
  
}//end class