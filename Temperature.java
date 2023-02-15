import java.util.*;
class Temperature
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    if(t<0)
    {
      System.out.println("freezing point");
    }
    else if(t>=0 && t<10)
    {
      System.out.println("very cold weather");
    }
    else if(t>=10 && t<20)
    {
      System.out.println("cold weather");
    }
    else if(t>=20 && t<30)
    {
      System.out.println("normal temperature");
    }
    else if(t>=30 && t<40)
    {
      System.out.println("hot");
    }
    else
    {
      System.out.println("very hot");
     }
  }
}