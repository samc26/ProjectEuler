//https://projecteuler.net/problem=5

package smallestmultiple;

public class SmallestMultiple {

    public static void main(String[] args) {
        boolean isEvenlyDivisible = false;
        int i = 1;
        while (!isEvenlyDivisible){
            for (int n = 1; n<=20; n++){
                if(n%i==1){
                    isEvenlyDivisible = false;
                    break;
                }
                else{
                    isEvenlyDivisible = true;
                }
            }
            i++;
        }
        System.out.println(i);
    } 
}
