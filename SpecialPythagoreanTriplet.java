//https://projecteuler.net/problem=9

package specialpythagoreantriplet;

public class SpecialPythagoreanTriplet {

    public static void main(String[] args) {
            int abc = 0;
            for(int a = 1; a<1000; a++){
              for(int b = 1; b<1000; b++){
                  for (int c = 1; c < 1000; c++){
                      if(a+b+c==1000&&(a*a+b*b==c*c)){
                          abc = a*b*c;
                      }
                  }
               }
        }
        System.out.println(abc);
    }
    
}
