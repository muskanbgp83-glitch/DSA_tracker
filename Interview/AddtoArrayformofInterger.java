
// 🤔Intuition: Add a number k to an array-form integer by simulating right-to-left schoolbook addition, adding corresponding digits and any carry.

// 💁🏻Approach: Loop backwards through the array while digits remain in the array or k, compute the sum, carry, and single-digit result, store them in a list, handle any final carry, and reverse the list.

// ⏳Time Complexity: O(max(N,log10k)) where N is the array length.

// 🚀Space Complexity: O(max(N,log 10k)) to store the result list.


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AddtoArrayformofInterger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int p = num.length-1;
        int carry = 0;
        while(p>=0||k>0){
         int numval = 0;
         if(p>=0){
            numval=num[p];

         }
         int d = k%10;
         int sum = numval+d+carry;
         int digit = sum%10;
         carry = sum/10;
         ans.add(digit);
         p--; //moving the pointer
         k=k/10; //removing lst digit from k
        }
        if(carry>0){

            ans.add(carry);//adding carry to the array list

        }
        Collections.reverse(ans); //reversing the ans array list
        return ans;
    }
}