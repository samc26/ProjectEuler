//https://projecteuler.net/problem=6
package sumsquaredifference;

public class SumSquareDifference {

    public static void main(String[] args) {
        int squaresSummed = 0;
        int sumsSquared = 0;
        int firstXNumbers = 100;
        
        for (int i = 1; i <= firstXNumbers; i++){
            squaresSummed += Math.pow(i, 2);//squares each number
        }
        for (int j = 1; j <= firstXNumbers; j++){
            sumsSquared += j;
        }
        sumsSquared = sumsSquared * sumsSquared;//we can square numbers this way too
        
        int difference = sumsSquared - squaresSummed;
        System.out.println(difference);
        
    }
}
