import java.util.*;
class Ternaryoperator
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int age;
   age=sc.nextInt();
   String result=age>=18?"You are eligible for vote":"you are not eligible for vote";
   System.out.println(result);
 }
}