import java.io.*;
import java.util.*;
  public class StrChange{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String 1:");
      String str1=sc.next();
      System.out.println("Enter String 2:");
      String str2=sc.next();
      System.out.println("Enter K value:");
      int K=sc.nextInt();
      int count=0;
        for(int i=0;i<str1.length() && i<str2.length();i++)
          {
            if(str1.charAt(i)!=str2.charAt(i))
              {
                count++;
              }
          }
          if(count==K)
            {
              System.out.println("Yes");
            }
           else
            {
              System.out.println("No");
            }
     }
  }   
