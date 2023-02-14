class Solution {
   public String addBinary(String a, String b) {
        String s = "";
        int k, temp = 0;

        if (a.length() > b.length())
            k = a.length();
        else
            k = b.length();

        while (a.length() != k)
            a = "0" + a;

        while (b.length() != k)
            b = "0" + b;

        for (int i = k - 1; i >= 0; i--) {
            int p1 = Integer.valueOf(a.charAt(i) - '0');
            int p2 = Integer.valueOf(b.charAt(i) - '0');
            int elemet = (temp + p1 + p2) % 2;
            temp = (temp + p1 + p2) / 2;
            s = elemet + s;
        }
        
        if (temp == 1)
            s = temp + s;
        
        return s;
    }
}
