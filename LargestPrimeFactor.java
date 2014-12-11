/*
https://projecteuler.net/problem=3
The projecteuler.net problem is to find the largest prime factor of 600851475143, but for my program I decided to take a user inputed long, and find it's largest prime factor.
For the projecteuler.net solution, simply input 600851475143 when prompted
*/
package largestprimefactor;

import java.util.Scanner;

public class LargestPrimeFactor {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int theLargestFactor = 0;
            
        System.out.println("What number would you like to find the largest prime factor of?");
        long n = keyboard.nextLong();  
    
        while(n%2==0){//factors out all 2s
            n=n/2;
            theLargestFactor = 2;
        }
        for (int i=3; i < n; i = i+2){
            //System.out.println("i");
            if(n%i==0){//if i divides n
                    for(int x=2; x<i;x++){//check to see if i is prime
                        if(i%x==0){//if i is divisible by x
                            break;
                        }   
                        if(x==i-1){
                            theLargestFactor=i;
                        }
                    }
                    if(i>=Math.sqrt(n)){
                        break;
                    }
            }
        }
        
        System.out.println(theLargestFactor);
    }   
}
