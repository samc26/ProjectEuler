//https://projecteuler.net/problem=1

package multiplesof3and5;

public class MultiplesOf3And5 {
    public static void main(String[] args) {
    
        int n = 0;
        int sum = 0;
        while (n <1000){
            if(n%3==0 || n%5==0){
                sum+=n;
            }
            n++;
        }
    System.out.println(sum);
    } 
}