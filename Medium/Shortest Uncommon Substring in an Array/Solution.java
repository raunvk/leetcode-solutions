class Solution {
    public String[] shortestSubstrings(String[] arr) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            String s = arr[i];
            HashSet<String> hs = new HashSet<>();
            for(int j=0; j<arr[i].length(); j++) {
                for(int k=j+1; k<=arr[i].length(); k++) {
                    hs.add(s.substring(j,k));
                }
            }
            for (String e : hs) {
                // Adds all strings from Set to Map
                hm.put(e, hm.getOrDefault(e,0) + 1);
            }
        }
        for(int i=0;i<arr.length;i++) {
            String s = arr[i];
            ArrayList<String> al = new ArrayList<>();
            for(int j=0; j<arr[i].length(); j++) {
                for(int k=j+1; k<=arr[i].length(); k++) {
                    if(hm.get(s.substring(j,k)) == 1)
                        al.add(s.substring(j,k));
                }
            }
            if(al.size() == 0)
                arr[i] = "";
            else if(al.size() == 1)
                arr[i] = al.get(0);
            else {
                // Sorts lexicographically, but not lengthwise
                Collections.sort(al); 
                String ans = al.get(0);
                for(int b=1; b<al.size(); b++){
                    // Provides lexicographically smallest length
                    if(al.get(b).length()<ans.length()) 
                        ans = al.get(b);
                }
                arr[i] = ans;
            }
        }
        return arr;
    }
}