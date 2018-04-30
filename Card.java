public class Card{
  
  //class attributes
  private String suit;
  private String value;
  
  //constructor
  public Card(){
    this.suit = "Spade";
    this.value = "Ace";
  }
  
  //getters and setters
  
  public void setSuit(String suit){
    this.suit = suit;
  }
  
  public String getSuit(){
    return this.suit;
  }
  
  public void setValue(String value){
    this.value = value;
  }
  
  public String getValue(){
    return this.value;
  }
  
  //toString method - print out class info
  public String toString(){
    return "Card: " + this.suit + " " + this.value;
  }
  
}