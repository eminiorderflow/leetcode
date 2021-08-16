class Solution {
    public int tribonacci(int n) {

        int[] tribNum = new int[n+1];

        tribNum[0] = 0;
        if (n > 0) tribNum[1] = 1;
        if (n > 1) tribNum[2] = 1;

        int i = 3;
        while(i <= n) {
            tribNum[i] = tribNum[i-1] + tribNum[i-2] + tribNum[i-3];
            i++;
        }
        return tribNum[n];
    }
}