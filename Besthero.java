import java.util.*;
class Besthero
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s1,s2;
    int h1,a1,f1,h2,a2,f2,t1,t2;
    s1=sc.nextLine();
    h1=sc.nextInt();
    a1=sc.nextInt();
    f1=sc.nextInt();
    sc.nextLine();
    s2=sc.nextLine();
    h2=sc.nextInt();
    a2=sc.nextInt();
    f2=sc.nextInt();
    t1=h1*(10)+a1*(5)+f1*(-5);
    t2=h2*(10)+a2*(5)+f2*(-5);
    if(t1>t2)
    {
       System.out.println(s1);
    }
    else
    {
      System.out.println(s2);
    }
     
    
   }
}
    
