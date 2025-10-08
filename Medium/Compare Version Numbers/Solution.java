class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr_v1 = version1.split("\\.");
        String[] arr_v2 = version2.split("\\.");
        int l = Math.max(arr_v1.length, arr_v2.length);
        for(int i=0; i<l; i++) {
            int n1 = (i >= arr_v1.length) ? 0 : Integer.parseInt(arr_v1[i]);
            int n2 = (i >= arr_v2.length) ? 0 : Integer.parseInt(arr_v2[i]);
            if(n1 > n2) 
                return 1;
            else if(n2 > n1) 
                return -1;
        }
        return 0;
    }
}