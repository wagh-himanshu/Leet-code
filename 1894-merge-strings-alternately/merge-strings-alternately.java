class Solution {
    public String mergeAlternately(String word1, String word2) {
      StringBuilder result = new StringBuilder();
        int i = 0;
        int n1 = word1.length();
        int n2 = word2.length();
        
        // Loop through both strings until the end of one is reached
        while (i < n1 || i < n2) {
            if (i < n1) {
                result.append(word1.charAt(i));
            }
            if (i < n2) {
                result.append(word2.charAt(i));
            }
            i++;
        } 
        return result.toString(); 
    }
}