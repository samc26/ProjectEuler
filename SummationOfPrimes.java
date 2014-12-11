//https://projecteuler.net/problem=10

package summationofprimes;

public class SummationOfPrimes {

    public static void main(String[] args) {
        long sumOfPrimes = 0;
        for (int i=2; i<2000000; i++){
            if(isPrime(i)){
                sumOfPrimes += i;
            }
        }
        System.out.println(sumOfPrimes);
    }
    private static boolean isPrime(int p){
        for(int i = 2; i <= Math.sqrt(p); i++){
            if(p%i==0){
                return false;
            }
        }  
        return true;
    }   
}
