public class Animal
{
  public void eat()
  {
    System.out.println("food");
  }
   public static void main(String args[])
  {
   Animal a=new Horse();
     a.eat();
     Animal c=new Animal();
     c.eat();
  }   
}

class Horse extends Animal
{
 
  
  public void eat()
  {
    System.out.println("eating nice food");
  }
  
  
}
  
  