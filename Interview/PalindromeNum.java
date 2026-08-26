// Intuition: A number is a palindrome if it reads the same forward and backward. Negative numbers are never palindromes.
//  We mathematically extract digits from right to left to build the reversed number.

// Approach: Check if x < 0. If not, use a while loop with modulo (% 10) and division (/ 10) to reverse the digits into revNum, 
// then compare revNum with the original x.

// Time Complexity: O(\log_{10} x) (proportional to the number of digits).

// Space Complexity: O(1) (constant extra space).



public class PalindromeNum{
    public boolean isPalindrome(int x){

    
    if(x<0){
        return false;

    }
    
    int n = x;
    int revNum = 0;
    while(n>0){
        int L_digit =n%10;
        revNum =revNum*10+L_digit;
        n = n/10;


    }
    
    if(revNum==x){
        return true;
    }else{
        return false;
    }
    }
}