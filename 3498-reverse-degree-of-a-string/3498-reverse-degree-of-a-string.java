class Solution {
    public int reverseDegree(String s) {
        if(s.length() < 0)
            return 0;
        int sum = 0;
        for(int i = 0 ; i < s.length(); i++)
        {
            char c = s.charAt(i);
            int reverseValue = 27 - (c - 'a' + 1);
            sum += (reverseValue * (i+1));
        }
        return sum;
    }
}