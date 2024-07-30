class Solution {
    public String countAndSay(int n) {
        String out = "1";
        for (int i = 0; i < n-1; i++){
            char prevChar = out.charAt(0);
            int count = 1;
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j < out.length(); j++){
                if (prevChar == out.charAt(j))
                count++;
                else {
                    sb.append(Integer.toString(count)).append(prevChar);
                    prevChar = out.charAt(j);
                    count = 1;
                }
            }
            sb.append(Integer.toString(count)).append(prevChar);
            out = sb.toString();
        }
        return out;
    }
}