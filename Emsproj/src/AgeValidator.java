import java.rmi.AccessException;
import java.util.Scanner;

public class AgeValidator{
      public static void main(String[] args) throws Exception
     {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter Age: ");
      int age = s.nextInt();

      try{
        if(age<18)
        throw new Exception("Invalid age");
      else
        System.out.println("Valid Age");
       }
       catch (AccessException a)
       {
        System.out.println("a");
       }
}
}