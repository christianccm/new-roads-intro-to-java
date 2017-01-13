public class Card{
  
  
  //first - declare the properties/members, aka info/details about the object
  private String rank;
  private String color;
  private String suit;
  
  //second - create a constructor
  public Card(){
    rank = "A";
    color = "black";
    suit = "club";
    
  }
  
  //getters and setters - mutators and accessors
  
  //getters
  public String getRank(){
    return rank;
  }
  public String getColor(){
    return color;
  }
  public String getSuit(){
    return suit;
  }
  
  //setter
  public void setRank(String newRank){
    rank = newRank;
  }
  public void setColor(String newColor){
    color = newColor;
  }
  public void setSuit(String newSuit){
    suit = newSuit;
  }
  
  //outputs details of the object
  public String toString(){
    return rank + " " + color + " " + suit;
  }
  
  
  
}