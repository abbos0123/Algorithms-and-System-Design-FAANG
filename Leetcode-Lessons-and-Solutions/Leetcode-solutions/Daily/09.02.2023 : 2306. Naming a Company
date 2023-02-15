class Solution {
 public long distinctNames(String[] ideas) {
        HashSet<String> sets=new HashSet<>();
		int[][] dp=new int[26][26];
		int n=ideas.length;
		long count=0;

		for(String idea:ideas)
			sets.add(idea);

		for(String idea:ideas)
		{
			for(int j=0;j<26;j++)
			{
				String s=(char)(j+'a')+idea.substring(1);

				if(!sets.contains(s))
					dp[idea.charAt(0)-'a'][j]++;
			}
		}
		for(int i=0;i<26;i++)
			for(int j=0;j<26;j++)
				count+=dp[i][j]*dp[j][i];

		return count;
    }
}
