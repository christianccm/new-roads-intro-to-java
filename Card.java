public class Card{
  
  //first - declare the properties/members, aka info/details about the object
  String rank;
  String color;
  String suit;
  
  //second - create a constructor
  public Card(){
    rank = "A";
    color = "black";
    suit = "club";
    
  }
  
  //outputs details of the object
  public String toString(){
    return rank + " " + color + " " + suit;
  }
  
  
  
}