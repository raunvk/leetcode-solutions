class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int totaltime = 0;
        int lastgindex = 0;
        int lastpindex = 0;
        int lastmindex = 0;
        for(int i=1; i<travel.length; i++) {
            travel[i] += travel[i-1];
        }
        for(int i=0; i<garbage.length; i++){
            String s = garbage[i];
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)=='G') lastgindex = i;
                if(s.charAt(j)=='P') lastpindex = i;
                if(s.charAt(j)=='M') lastmindex = i;
                totaltime++;
            }
        }
        if(lastgindex>0) totaltime += travel[lastgindex-1];
        if(lastmindex>0) totaltime += travel[lastmindex-1];
        if(lastpindex>0) totaltime += travel[lastpindex-1];
        return totaltime;
    }
}