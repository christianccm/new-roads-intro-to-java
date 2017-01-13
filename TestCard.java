public class TestCard{
  
  public static void main(String[] args){
    //write test code here
    
    //create Card object
    Card c1 = new Card();
    Card c2 = new Card();
    
    //print out card object
    System.out.println(c1);
    
    c1.setRank("J");
    
    System.out.println(c1);
    
    c2.setRank("K");
    c2.setColor("red");
    c2.setSuit("heart");
    
    System.out.println(c2);
    
  }//end of main method
  
}//end of class
