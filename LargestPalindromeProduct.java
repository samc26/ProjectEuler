//https://projecteuler.net/problem=4

package largestpalindromeproduct;

public class LargestPalindromeProduct {

    public static void main(String[] args) {
        int palindrome;
        boolean checkPalindrome;
        int largestPalindrome = 0;
        for(int x = 100; x<1000; x++){
            for(int y = 100; y<1000; y++){
                palindrome = x*y;
                checkPalindrome = isAPalindrome(palindrome);
                if(checkPalindrome){
                    if(palindrome>largestPalindrome){
                        largestPalindrome = palindrome;
                    }
                }
            }
        }
        System.out.println(largestPalindrome);
    }
    private static boolean isAPalindrome(int x){
        boolean m = false;
        String thing = "" + x;        
        for (int i=0; i<(thing.length()/2);i++){            
            char thang = thing.charAt(i);
            char otherThang = thing.charAt(thing.length()-1-i);
            if (thang != otherThang){
                break;
            }
            if(i == (thing.length()/2)-1){
                m = true;
                //System.out.println("this number is a palendrome!");            
            }
        }       
    
        return m;
    }
}