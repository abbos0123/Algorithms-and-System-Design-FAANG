class Solution {
      public int countOdds(int low, int high) {
        if (low % 2 == 0)
            low++;
        if (high % 2 == 0)
            high--;
        int n = (high - low) / 2 +1;
        return n;
    }  
}
