import java.util.*;
public class Problem3{
  public static void main(String[] args){
    long n=600851475143L;
    int maxPrimeFactor= 1;
    for(int i=2;i<=n;i++){
      while(n%i==0){
        maxPrimeFactor=i;
        n=n/i;
      }
    }
    System.out.println("The largest prime factor of 600851475143 is " + maxPrimeFactor);
  }
}