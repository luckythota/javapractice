import java.util.*;
class Season
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   switch(a)
   {
    case 3:
    case 4:
    case 5:
    case 6:
       System.out.println("Summer");
       break;
    case 7:
    case 8:
    case 9:
    case 10:
        System.out.println("rainy");
        break;
    case 11:
    case 12:
    case 01:
    case 02:
      System.out.println("winter");
      break;
    default:
      System.out.println("invaid");
    
    }
  }
}
   
    
