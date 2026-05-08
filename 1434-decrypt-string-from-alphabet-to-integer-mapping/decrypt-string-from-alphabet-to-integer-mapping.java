class Solution {
    public String freqAlphabets(String s) {

        StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < s.length()) {

            // Check for two-digit number followed by #
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {

                int num = Integer.parseInt(s.substring(i, i + 2));

                ans.append((char) ('a' + num - 1));

                i += 3;

            } else {

                int num = s.charAt(i) - '0';

                ans.append((char) ('a' + num - 1));

                i++;
            }
        }

        return ans.toString();
    }
}