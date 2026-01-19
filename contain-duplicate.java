// duplicate using brute force 

class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean ans;
        int n=nums.length;
        for (int i =  0 ; i < n ; i++ ){
        for (int j = i+1; j<n ;j++)  {
           if (nums[i]==nums[j]){
           return  ans = true;
            
           }
           }
}
        return ans = false;
        
    }
}


// duplicate using hashmap
import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
      
         HashMap<Integer,Integer > ans = new HashMap <>();
         for (int num : nums ){
         
          if (ans.containsKey(num)){
           return true;

          }
            ans.put (num,1);

         }

 return false;

    }
}
