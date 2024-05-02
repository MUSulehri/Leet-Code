class Solution {
    public Boolean recursionCheck (String[] strs, int curr, int index, char c) {
        if (strs.length <= curr) return true;
        if (strs[curr].length() <= index) return false;
        if (strs[curr].charAt(index) != c) return false;
        return recursionCheck (strs, curr + 1, index, c);
    }
    public String longestCommonPrefix(String[] strs) {
        String common = "";
        for (int i = 0; i < strs[0].length(); i++) {
            if (recursionCheck (strs, 0, i, strs[0].charAt(i)))
                common += strs[0].charAt(i);
            else
                break;
        }
        return common;
    }
}