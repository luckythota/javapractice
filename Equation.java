import java.util.*;
class Equation
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int a,b,c,d;
   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();
   d=(b*b-(4*a*c));
   System.out.println(d);
   if(d==0)
   {
     System.out.println("equal");
   }
   else if(d>0)
   {
     System.out.println("real and distinct");
    }
    else
    {
      System.out.println("complex");
    }
  }
}
   