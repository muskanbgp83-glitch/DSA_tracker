// 🤔Intuition: We start by drinking all available full water bottles. 
// Then, we can take the empty bottles and exchange them for new full ones based on the exchange rate, drinking those too,
//  and repeating the process until we don't have enough empty bottles left for an exchange.

// 💁🏻Approach: Initialize ans with the initial number of bottles (numBottles). 
//Use a while loop that runs as long as the current number of bottles is greater than or equal to numExchange.
// Inside the loop, calculate how many new bottles we get (numBottles / numExchange) and the remaining empty bottles (numBottles % numExchange),
//add the new bottles to ans, and update numBottles to be the sum of the newly acquired bottles and the remainder.

// ⏳Time Complexity: O(log numExchange numBottles) because the number of bottles decreases exponentially with each exchange round.

// 🚀Space Complexity: O(1) since it only uses a constant amount of extra memory for variables.

class WaterBottels {
    public int numWaterBottles(int numBottles, int numExchange) {

    int ans = numBottles;
    while(numBottles>=numExchange){
        int newBottles=numBottles/numExchange;
        int remBottles =numBottles%numExchange;
        ans = ans+newBottles;
        numBottles=newBottles+remBottles;

    } 
    return ans;       
    }
}