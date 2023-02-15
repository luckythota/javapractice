import java.util.*;
class Electricitybill
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int charge;
      double cc,tc;
      charge=sc.nextInt();
      if(charge>0 && charge<=50)
      {
           cc=charge*0.50;
      }
      else if(charge>50 && charge<=150)
      {
           cc=charge*0.75;
      }
      else if(charge>150 && charge<=250)
      {
           cc=charge*1.20;
      }
      else
      {
         cc=charge*1.50;
      }
       System.out.println(cc);
       tc=cc+cc*(0.2);
       System.out.println(tc);
   }
}
       


        
      