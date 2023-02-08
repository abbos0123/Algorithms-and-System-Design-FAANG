Approach
1. Initially, set pos to end of the array. Because it is final destinaion.
2. find most left element which can reach the position.
3. set pos to found index;
4. repeat this until pos reach the head of the array.
5. return counted actions.

Complexity
 1. Time complexity: O(n*n)
2. Space complexity: O(1)

Code


class Solution {
    public int jump(int[] nums) {
       if(nums.length == 1) return 0;
       int n = nums.length-1;
       int result = 0;
       int pos = n;

       while(pos >= 0){
           if(pos == 0) return result;

           for(int i = 0; i < pos; i++){
               if(i + nums[i] >= pos){
                   result ++;
                   pos = i;
                   break;
               }
           }
       }
      
      return result;
    }
}
