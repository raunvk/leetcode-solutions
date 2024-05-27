class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            int remainder = (columnNumber - 1) % 26; // Adjust for 1-based indexing
            char digit = (char) ('A' + remainder);
            result.insert(0, digit); // Insert the character at the beginning of the result
            columnNumber = (columnNumber - 1) / 26; // Adjust for 1-based indexing
        }
        return result.toString();
    }
}