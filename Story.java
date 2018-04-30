/*
  Author: Sina
  
  The Story class has methods to read story from a text file
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Story{
  
  public Story(){
    //default constructor
  }
  
  public void readFile(String filename){
    
    //declare variables and objects
    String currentLine;
    
    //try reading a file
    try(BufferedReader br = new BufferedReader(new FileReader(filename))){
      
      //the logic to read the file
      while((currentLine = br.readLine()) != null){
        System.out.println(currentLine);
      }
      
      
    } catch(IOException e){
      e.printStackTrace();
    }
    
  }
  
}//end class