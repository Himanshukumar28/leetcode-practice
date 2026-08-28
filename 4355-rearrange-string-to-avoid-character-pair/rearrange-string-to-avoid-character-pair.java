class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder ans = new StringBuilder();
        // Put all y first
        for (char ch : s.toCharArray()) {
            if (ch == y) {
                ans.append(ch);
            }
        }
        // Put other characters
        for (char ch : s.toCharArray()) {
            if (ch != x && ch != y) {
                ans.append(ch);
            }
        }
        // Put all x last
        for (char ch : s.toCharArray()) {
            if (ch == x) {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}