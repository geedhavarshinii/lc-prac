class Solution {
    public int numberOfChild(int n, int k) {
        n--;
        int chunks = k / n;
        return chunks % 2 == 0 ? (k % n)  : n - (k%n);
    }
}