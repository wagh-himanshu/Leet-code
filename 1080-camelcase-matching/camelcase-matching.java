class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> result = new ArrayList<>();

        for (String query : queries) {
            result.add(match(query, pattern));
        }

        return result;
    }

    private boolean match(String query, String pattern) {
        int i = 0; // pointer for pattern

        for (char ch : query.toCharArray()) {

            // if characters match
            if (i < pattern.length() && ch == pattern.charAt(i)) {
                i++;
            }
            // uppercase character not matching pattern
            else if (Character.isUpperCase(ch)) {
                return false;
            }
        }

        // all pattern characters should be matched
        return i == pattern.length();
    }
}