/*
  Testing my custom Card class
  by passing an argument through the terminal
*/
public class TestCard{
  
  public static void main(String[] args){
    
    Card card1 = new Card();
    card1.setValue(args[0]);
    
    System.out.println(card1);
    
  }
  
}