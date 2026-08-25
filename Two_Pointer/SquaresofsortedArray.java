// INTUITION💁🏼

// Split the array into negative and positive parts, square them, and merge the sorted halves.
// APPROACH🧑🏼‍💻

// Separate negative and positive numbers into two lists.
// Square all elements.
// Reverse the negative list to restore ascending order.
// Merge both lists into the result array using a two-pointer approach.

// Time Complexity: O(N)
// Space Complexity: O(N)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SquaresOfSortedArraySolution {
    
    
    public int[] sortedSquares(int[] nums) {
        @SuppressWarnings("unused")
        int n = nums.length;
        
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        
        // separate negative and pos no.
        for (int num : nums) {
            if (num < 0)
                neg.add(num);
            else
                pos.add(num);
        }
        
        // NO NEGATIVE NO.
        if (neg.isEmpty()) {
            for (int i = 0; i < pos.size(); i++)
                pos.set(i, pos.get(i) * pos.get(i));
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }
        
        // NO POSITIVE NO.
        if (pos.isEmpty()) {
            for (int i = 0; i < neg.size(); i++)
                neg.set(i, neg.get(i) * neg.get(i));
            Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }
        
        // BOTH P&N
        int i,j,id = 0;
        int n1 = neg.size();
        int n2 = pos.size();
        int[] res = new int[n1 + n2];
        
        for (i = 0; i < n1; i++)
            neg.set(i, neg.get(i) * neg.get(i));
        Collections.reverse(neg);
        
        for (i = 0; i < n2; i++)
            pos.set(i, pos.get(i) * pos.get(i));
        
        i = 0;
        j = 0;
        while (i < n1 && j < n2) {
            if (neg.get(i) <= pos.get(j)) {
                res[id++] = neg.get(i++);
            } else {
                res[id++] = pos.get(j++);
            }
        }
        
        while (i < n1)
            res[id++] = neg.get(i++);
            
        while (j < n2)
            res[id++] = pos.get(j++);
            
        return res;
    }
}
