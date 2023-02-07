
class Solution {
    public int totalFruit(int[] fruits) {
       int first = -1;
       int second = -1;
       int n = fruits.length, max = 0;

       for(int i = 0; i < n - max; i++){
           first = fruits[i];
           second = -1;
           int b1 = 1, b2 = 0;
           max = Math.max(b1, max);
           
           for(int j = i+1; j < n; j++){
               if(fruits[j] == first){
                   b1++;
                   continue;
               }

               if(second == -1 || second == fruits[j]){
                   b2++;
                   second = fruits[j];
                   continue;
               }

               break;
           }

           max = Math.max(b1 + b2, max);
       }

       return max;
    }
}
