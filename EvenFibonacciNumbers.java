//https://projecteuler.net/problem=2

package evenfibonaccinumbers;

public class EvenFibonacciNumbers {

    public static void main(String[] args) {
        int pastTerm = 1;
        int currentTerm = 1;
        int nextTerm;
        int sum = 0;
        
        while (currentTerm<4000000){
            if(currentTerm%2==0){
                sum += currentTerm;
            }
            nextTerm = currentTerm+pastTerm;
            pastTerm = currentTerm;
            currentTerm = nextTerm;
        }
        System.out.println(sum);    
    }
}
