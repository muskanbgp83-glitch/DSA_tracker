// 🤔Intuition: A number is a power of three if it can be divided by 3 repeatedly until it reduces to 1, 
// with no other prime factors remaining. Numbers less than 1 cannot be powers of three.

// 💁🏻Approach: Handle edge cases where n<1 (return false) or n==1 (return true).
//  Otherwise, run a while loop that continuously divides n by 3 as long as it is evenly divisible (n % 3 == 0), then check if the final value equals 1.

// ⏳Time Complexity: O(logn) because n is divided by 3 in each iteration.

// 🚀Space Complexity: O(1) since it only uses constant extra space for variables.

public class PowerOf3 {
    public boolean isPowerOfThree(int n) {
        if(n<1){
            return false;

        }
        else if(n==1){
            return true;
        }
        
            while(n%3==0){
                n=n/3;
            }
            
        
        if(n==1){
                return true;
            }
            else{
                return false;
            }
    }
}