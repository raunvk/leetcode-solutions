class Solution {
    public String restoreString(String s, int[] indices) {
        int n = indices.length;
        char[] result = new char[n];
        for (int i=0; i<n; i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
}