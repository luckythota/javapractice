import java.util.*;
class Vowel
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    char ch=sc.nextLine().charAt(0);
    ch=Character.toLowerCase(ch);
    switch(ch)
    {
       case 'a':
       case 'e':
       case 'i':
       case 'o':
       case 'u':
          System.out.println(ch+" is a vowel");
          break;
       default:
          System.out.println(ch+" is a consonant");
     }
  }
} 
          

    
    
    
  