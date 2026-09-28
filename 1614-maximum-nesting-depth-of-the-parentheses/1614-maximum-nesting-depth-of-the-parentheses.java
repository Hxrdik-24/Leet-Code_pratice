class Solution {
    public int maxDepth(String s) {
        int dep = 0;
        int maxDepth = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == '(')
            {
                dep++;
                if (dep > maxDepth)
                {
                    maxDepth = dep;
                }
            }
            else if(c == ')')
                dep--;
            
        }
        return maxDepth;
    }
}