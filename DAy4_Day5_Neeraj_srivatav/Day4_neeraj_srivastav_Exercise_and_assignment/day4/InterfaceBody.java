interface Principle
{
  void print();
  static int cube(int x)
  {
    return x*x*x;
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
class InterfaceBody implements Showable
{
   public void print(){System.out.println("hello");}
   public void print2(){System.out.println("hello word");}
   public void show(){System.out.println("welcome");}
   public static void main(String[] args)
      {
        InterfaceBody obj=new InterfaceBody();
        obj.print();
        obj.print2();
        obj.show();
        System.out.println(Principle.cube(5));
      }
}

