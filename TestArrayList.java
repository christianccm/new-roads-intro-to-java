public class TestArrayList{
  public static void main(String[] args){
    CustomArrayList list = new CustomArrayList();
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.remove(1);
    
    System.out.println(list + " size: " + list.size());
  }
}