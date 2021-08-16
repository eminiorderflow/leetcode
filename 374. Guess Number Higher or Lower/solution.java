/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int start = 1;
        int end = n;

        while ((end - start) >= 0) {
            int mid = start + (end - start)/2;

            if (guess(start) == 0) return start;
            if (guess(end) == 0) return end;
            if (guess(mid) == 0) return mid;

            if (guess(mid) == -1) end -= (end-start)/2;
            else start += (end-start)/2;
        }
        return end - start;
    }
}