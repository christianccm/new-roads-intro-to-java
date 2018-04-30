public class Animal{

  //declare properties
  private int age;
  private int aggressionLevel;
  
  //constructors
  //zero-argument constructor - default values
  public Animal(){
    this.age = 1;
    this.aggressionLevel = 1;
  }
  
  //loaded constructor
  public Animal(int age, int aggressionLevel){
    this.age = age;
    this.aggressionLevel = aggressionLevel;
  }
  
  //mutators - getters and setters of properties
  public int getAge(){
    return this.age;
  }
  
  public void setAge(int age){
    this.age = age;
  }
  
  public int getAggressionLevel(){
    return this.aggressionLevel;
  }
  
  public void getAggressionLevel(int aggressionLevel){
    this.aggressionLevel = aggressionLevel;
  }
  
  //toString method - prints out info about the object
  public String toString(){
    return "Age: " + this.age + " Aggression Level: " + this.aggressionLevel; 
  }
  
}