class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];

        String prefix = "";

        for (int i = 0; i < strs[0].length(); i++) {

            String temp = "";

            for (int j = 1; j < strs.length; j ++) {
                if (strs[j].length() > i && strs[0].charAt(i) == strs[j].charAt(i)) {
                    temp+=strs[0].charAt(i);
                }
            }

            if (temp.length() == strs.length - 1 && temp.length() > 0) {
                prefix+=temp.charAt(0);
            } else {
                return prefix;
            }
        }
        return prefix;
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}