import java.util.*;

public class Problem2 {
  public static void main(String[] args){ 
    int a=1,b=2;
    int c=0,sum=2;
    while(true){
       c=a+b;
       if(c>=4000000){
         break;
       }
       if(c%2==0){
         sum+=c;
       }  
       a=b;
       b=c;
    }
    
    System.out.println("The sum of even Fibonacci numbers <= 4 million is " + sum);
  }
}