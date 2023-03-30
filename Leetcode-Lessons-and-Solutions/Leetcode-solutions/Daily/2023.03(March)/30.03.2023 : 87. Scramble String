class Solution {
    Map<String, Boolean> mp = new HashMap<>();
    
    public boolean helper(String a, String b)
    {
        if(a.equals(b) == true) return true;
        
        if(a.length() <= 1) return false;
        
        int n = a.length();
        boolean check = false;
        
        String key = a;
        
        key += ' ' + b;
        
        if(mp.containsKey(key))
             return mp.get(key);
        
        for(int i = 1; i < n; i++)
        {
            boolean swap = helper(a.substring(0, i), b.substring(n - i)) && helper(a.substring(i), b.substring(0, n - i));
            boolean unswap = helper(a.substring(0,i), b.substring(0,i)) && helper(a.substring(i), b.substring(i));
            
            if(swap || unswap){
                check = true;
                break;
            }
        }
        
        mp.put(key, check);
        
        return check;
    }
    
    public boolean isScramble(String a, String b)
    {
        if(a.equals(b) == true) return true;
        
        if(a.length() != b.length()) return false;
        
        if(a.isEmpty() == true) return true;
        
        return helper(a, b);
    }
}
