import java.util.*;
class Netsalary
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int bs,hra,da,ta,pf,pt,gs,ns;
      bs=sc.nextInt();
      hra=sc.nextInt();
      da=sc.nextInt();
      ta=sc.nextInt();
      pf=sc.nextInt();
      pt=sc.nextInt();
      gs=bs+hra+da+ta;
      ns=gs-(pf+pt);
      System.out.println(ns);
      sc.close();

    }
}
