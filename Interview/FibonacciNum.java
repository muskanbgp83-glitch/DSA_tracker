// 🤔Intuition: The Fibonacci sequence starts with 0 and 1, where each subsequent number is the sum of the previous two.
//  We can iteratively compute the n-th Fibonacci number by keeping track of the last two numbers.

// 💁🏻Approach: Handle base cases for n=0 and n=1. For larger values, 
// use a for loop running up to n to continuously update the previous two numbers (FirstNumber and SecondNumber) and return FirstNumber.

// ⏳Time Complexity: O(n) because the loop runs n times.

// 🚀Space Complexity: O(1) as it uses a constant amount of memory for variables.


public class FibonacciNum{
  
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
            int FirstNumber=0;
            int SecondNumber = 1;
        
            for(int i =1;i<=n;i++){
            
            int ThirdNumber = FirstNumber+SecondNumber;
            FirstNumber=SecondNumber;
            SecondNumber=ThirdNumber;
            
             
         
        }
        return FirstNumber;
    }
}  
