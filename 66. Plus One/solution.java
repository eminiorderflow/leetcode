class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;

        while (i >= 0) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
                if (i-1 < 0) {
                    int[] new_dig = new int[digits.length + 1];
                    new_dig[0] = 1;
                    for(int j = 1; j < new_dig.length; j++) {
                        new_dig[j] = digits[j-1];
                    }
                    return new_dig;
                }
            }
            i--;
        }
        return digits;
    }
}