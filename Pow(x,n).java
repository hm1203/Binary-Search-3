//Iterative approach

//Time Complexity:O(logN)

//Space Complexity:O(1)

//In this approach, I'll be convering x to its inverse and make N positive, if the given N is negative. Otherwise, I'll be iteratibvely computing the cur product and update the resultant pow variable when ever I encounter an odd power.

class Solution {

   public double myPow(double x, int n) {

       if(n==0){

           return 1.0;

       }

       long N=n;

       if(N<0){

            x=1/x;

            N=-N;

       }

       double pow=1;

       double cur=x;

       for(long i=N;i>0;i/=2){

           if((i%2)==1){

               pow=pow*cur;

           }

           cur=cur*cur;

       }

       return pow;

   }

}

//Recursive approach

//Here, I'll be repeating the same things in a recursive manner, by using divide and conquer approach.

class Pow(x,n) {

    // Time Complexity: O(log n)
    // Space Complexity: O(log n)   (space by recursion stack)

    public double myPow(double x, int n) {
        // If n = 0 --> return 1 (anything raised to zero is one)
        if(n == 0)
            return 1;
        double temp = myPow(x, n/2);
        // If n is even then -> multiply the returned value twice
        if(n % 2 == 0){
            return temp * temp;
        }
        // else multiply the returned value twice as well as x (both +ve and -ve cases)
        else{
            if(n < 0){
                return temp * temp * (1/x);
            }else{
                return temp * temp * x;
            }
        }
    }
}