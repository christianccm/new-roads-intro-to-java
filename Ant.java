public class Ant{
  
  //attributes
  private String gender;
  private int id;
  private int health;
  private boolean isAlive;
  
  //constructors
  public Ant(){
    this.health = 100;
    this.isAlive = true;
  }
 
  public Ant(String gender, int id, int health){
    this.gender = gender;
    this.id = id;
    this.health = health;
    this.isAlive = true;
  }
  
  //mutators
  public int getId(){
    return this.id;
  }
  
  public void setId(int id){
    this.id = id;
  }
  
  public String getGender(){
    return this.gender;
  }
  
  public void setGender(String gender){
    this.gender = gender;
  }
  
  //other mutators...
  
  //toString
  public String toString(){
    return "Ant id: " + this.id + " health: " + this.health + " isAlive: " + this.isAlive
      + " gender: " + this.gender;
  }
}