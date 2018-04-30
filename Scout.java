public class Scout extends Ant{
  
  //attributes
  private String status;
  
  //constructors
  public Scout(){
    this.status = "working";
  }
  
  //mutators
  public String getStatus(){
    return this.status;
  }
  
  public void setStatus(String status){
    this.status = status;  
  }
  
  //toString method
  public String toString(){
    return super.toString() + " ---- I am a scout ant!";
  }
  
}