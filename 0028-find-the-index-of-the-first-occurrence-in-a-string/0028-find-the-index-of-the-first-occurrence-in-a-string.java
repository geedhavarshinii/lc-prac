class Solution {
    public int strStr(String haystack, String needle) {
        int haylen = haystack.length();
        int needlen = needle.length();
        if (haylen < needlen) return -1;
        for (int i = 0; i <= haylen - needlen; i++){
            int j = 0;
            while (j < needlen && haystack.charAt(i+j)==needle.charAt(j)) j++;
            if (j==needlen) return i;
        }
        return -1;
    }
}