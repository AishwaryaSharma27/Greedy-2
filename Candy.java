// Time Complexity: O(N)
// Space Complexity: O(N)

import java.util.*;

class Solution {
    public int candy(int[] ratings) {
        if(ratings == null || ratings.length==0)    return 0;
        
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);
        
        for(int i=1; i < ratings.length; i++)
        {
            if(ratings[i]>ratings[i-1])
            {
                candies[i]=candies[i-1]+1;
            }
        }
        
        for(int i=ratings.length-2; i >=0; i--)
        {
                if(ratings[i]>ratings[i+1])
                candies[i]=Math.max(candies[i+1]+1,candies[i]);
        }
        int sum=0;
        for(int e:candies)
            sum+=e;
        return sum;
    }
}