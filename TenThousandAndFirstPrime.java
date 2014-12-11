//https://projecteuler.net/problem=7

package tenthousandandfirstprime;

public class TenThousandAndFirstPrime {
    public static void main(String[] args) {
        int n = 1;
        int nthPrime = 0;
        int currentPrime = 0;
        while(currentPrime <= 10001){
            if(isPrime(n)){
                nthPrime = n;
                currentPrime++;                
            }
            n++;
        }
        System.out.println(nthPrime);
    
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
