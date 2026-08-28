// 🤔Intuition: Similar to Fibonacci, the Tribonacci sequence starts with 0,1,1, where each subsequent number is the sum of the previous three numbers. We can iteratively compute the n-th Tribonacci number using three tracking variables.

// 💁🏻Approach: Handle base cases for n=0, n=1, and n=2. For larger values, use a for loop starting from 3 up to n to slide our window of three numbers forward until we reach the target.

// ⏳Time Complexity: O(n) because the loop runs n−2 times.

// 🚀Space Complexity: O(1) as it uses a constant amount of extra memory for variables.

public class Tribonacci {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1||n==2){
            return 1;
        }
       
        
        int FirstNumber = 0;
        int SecondNumber = 1;
        int ThirdNumber = 1;
        

        for(int i =3;i<=n;i++){
            int fourthNumber = FirstNumber + SecondNumber + ThirdNumber;
            FirstNumber =  SecondNumber;
            SecondNumber=ThirdNumber;
            ThirdNumber=fourthNumber;


             }
             return ThirdNumber;
    }
    
}