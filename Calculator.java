import java.util.*;
class Calculator
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int a,b;
     a=sc.nextInt();
     b=sc.nextInt();
     sc.nextLine();
     char ch=sc.nextLine().charAt(0);
     switch(ch)
     {
       case '+':
          System.out.println(a+b);
          break;
       case '-':
          System.out.println(a-b);
          break;
       case '*':
          System.out.println(a*b);
          break;
       case '/':
           System.out.println(a/b);
           break;
       case '%':
           System.out.println(a%b);
           break;
       default:
           System.out.println("not a valid symbol");
           break;
     }
  }
}
 
