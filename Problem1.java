import java.util.*;
public class Problem1{
  public static void main(String[] args){
    int n=1000;
    int sum=0;
    for(int i=1;i<n;i++){
       if(i%3==0 || i%5==0){
        sum+=i;
       }
    }
  System.out.println("The sum of multiples of 3 or 5 below 1000 is " + sum);
  }
}