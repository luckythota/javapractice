class Commandline2
{
  public static void main(String args[])
  {
     int sum=0;
     for(int i=0;i<args.length;i++)
     {
      //System.out.println("args["+i+"] = "+args[i]);
        sum=sum+Integer.parseInt(args[i]);
      
     }
      System.out.println(sum);
  }
}
   