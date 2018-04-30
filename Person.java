/**
  Author: Sina
  Last modified: 09/28/17
*/

public class Person{
 
  //declare attributes of object
  private String name;
  private int age;
  private String gender;
  
  //zero argument constructor
  public Person(){
    this.age = 1;
    this.name = "John Doe";
    this.gender = "male";
  }
  
  //loaded constructor
  public Person(String name, int age, String gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  
 //getters and setters for each attributes
  public String getName(){
    return this.name;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  //other mutators below
}