class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] fq1  = new int[26];
        // count the all char of String 1
        for(int i = 0; i < s.length(); i++)
        {
            int n = s.charAt(i) - 'a';
            fq1[n]++;
        }

        for(int i = 0; i < t.length(); i++)
        {
            int n = t.charAt(i) - 'a';
            fq1[n]--;
        }

        for(int i = 0; i < 26; i++) 
        {
            if(fq1[i] != 0)
                return false;
        }   
        return true;
    }
}