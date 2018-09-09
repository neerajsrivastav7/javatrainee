interface Principle
{
  void print();
  default void msg()
  {
    System.out.println("default message");
  }
}
interface Principle2
{
  void print2();
}
interface Showable extends Principle, Principle2
{
  void show();
}
class MultipleInterface implements Showable
{
   public void print(){System.out.println("hello");}
   public void print2(){System.out.println("hello word");}
   public void show(){System.out.println("welcome");}
   public static void main(String[] args)
      {
        MultipleInterface obj=new MultipleInterface();
        obj.print();
        obj.print2();
        obj.show();
        obj.msg();
      }
}

