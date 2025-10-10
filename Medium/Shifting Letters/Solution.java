class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] result = s.toCharArray();
        long shiftSum = 0;
        for(int i=shifts.length-1; i>=0; i--) {
            shiftSum = (shiftSum + shifts[i]) % 26;
            result[i] = (char) ('a' + (result[i]-'a' + shiftSum) % 26);
        }
        return new String(result);
    }
}