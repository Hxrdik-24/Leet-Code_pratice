class Solution {
    public int largestAltitude(int[] gain) {
        int at = 0;
        int max =0;
        for(int ele: gain)
        {
            at = at + ele;
            if(at > max)
                max = at;
        }
        return max;
    }
}