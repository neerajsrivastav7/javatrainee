public class Example1
{
   public static void main(String[] args)
     {
       Example1 e1=new Example1();
       GreetingService greetService=message->
       System.out.println("Hello"+message);
       greetService.sayMessage("World");
     }
}
interface GreetingService{
void sayMessage(String message);
}
