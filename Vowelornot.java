import java.util.*;
class Vowelornot
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    char ch=sc.nextLine().charAt(0);
    ch=Character.toLowerCase(ch);
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
    {
      System.out.println(ch +" is vowel");
     }
    else
    {
      System.out.println(ch +"  is not vowel");
     }
   }
}
