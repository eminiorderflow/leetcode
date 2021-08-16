/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {

    public int firstBadVersion(int n) {

        int start = 1;
        int end = n;

        while ((end - start) > 0) {

            int mid = start + (end - start)/2;

            if (isBadVersion(mid)) end -= (end - start)/2;
            else start += (end - start)/2;

            if((end - start) == 1 && isBadVersion(start)) return start;

            if((end - start) == 1 && isBadVersion(end)) return end;
        }
        return end;
    }
}



