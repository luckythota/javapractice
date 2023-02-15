import java.util.*;
class Racers
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,b,c,d,e,count=0;
    float avg;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
    e=sc.nextInt();
    avg=(a+b+c+d+e)/5;
    System.out.println(avg);
    if(a>avg)
    {
       System.out.println(a);
    }
    if(b>avg)
    {
       System.out.println(b);
    }
    if(c>avg)
    {
      System.out.println(c);
    }
    if(d>avg)
    {
      System.out.println(d);
    }
    if(e>avg)
    {
      System.out.println(e);
    }
  }
}



       

