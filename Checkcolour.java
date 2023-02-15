import java.util.*;
class Checkcolour
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     char ch;
     ch=sc.nextLine().charAt(0);
     ch=Character.toLowerCase(ch);
     switch(ch)
     {
       case 'v':
           System.out.println("violet");
           break;
       case 'i':
           System.out.println("indigo");
           break;
       case 'b':
           System.out.println("blue");
           break;
       case 'g':
           System.out.println("green");
           break;
       case 'y':
           System.out.println("yellow");
           break;
        case 'o':
           System.out.println("orange");
           break;
        case 'r':
           System.out.println("red");
           break;
        default:
           System.out.println("not rainbow colour");
           break;
      }
   }
}
      
   