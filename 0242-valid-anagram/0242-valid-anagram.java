class Solution {
    public boolean isAnagram(String s, String t) {
        // boolean ans = new boolean();
        // if (s.length() < t.length() || t.length() < s.length()) return -1;
        // for (int i = 0; i < s.length(); i++)
        char[] snew = s.toCharArray();
        char[] tnew = t.toCharArray();
        Arrays.sort(snew);
        Arrays.sort(tnew);
        return Arrays.equals(snew, tnew);
    }
}