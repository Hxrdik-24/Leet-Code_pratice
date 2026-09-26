class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] fq1  = new int[26];
        // count the all char of String 1 and inserat in array
        for(int i = 0; i < s.length(); i++)
        {
            fq1[s.charAt(i) - 'a']++;
            fq1[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++) 
        {
            if(fq1[i] != 0)
                return false;
        }   
        return true;
    }
}