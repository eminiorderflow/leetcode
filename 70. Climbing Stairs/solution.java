class Solution {
    public int climbStairs(int n) {

        int[] climb = new int[n+1];

        climb[0] = 1;
        climb[1] = 1;

        int i = 2;
        while (i <= n) {
            climb[i] = climb[i-1] + climb[i-2];
            i++;
        }
        return climb[n];
    }
}