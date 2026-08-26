// 🤔Intuition: A number is a power of two if it can be divided by 2 successively until it equals 1, without leaving any other prime factors.
//  Numbers less than 1 cannot be powers of two.

// 💁🏻Approach: Check if n<1 (return false) or n==1 (return true). Otherwise, repeatedly divide n by 2 using a while loop as long as it is evenly divisible (n % 2 == 0).
//  Finally, check if the reduced value of n equals 1.

// ⏳Time Complexity: O(log2n) because n is divided by 2 in each iteration.

// 🚀Space Complexity: O(1) since it only uses a constant amount of extra space.
class PowerOf2 {
    public boolean isPowerOfTwo(int n) {
        if(n<1){
            return false;
        }
        else if(n==1){
            return true;
        }
        else
        while(n%2==0){
            n = n/2;
        }
        if(n==1){
            return true;
        }else{
            return false;
        }
        
    }
}