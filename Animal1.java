public class Animal1
{
  public void eat()
  {
    System.out.println("food");
  }
   public static void main(String args[])
  {
   Animal1 a=new Horse();
     a.eat();
     Animal1 c=new Animal1();
     c.eat();
    
  }   
}

class Horse extends Animal1
{
 
  public Halter m;
  
  public void eat()
  {
    m=new Halter();
    m.show();
    System.out.println("eating nice food");
  }
  
  
}
  class Halter
  {
    public void show()
    {
      System.out.println("hello");
    }
  }