class Solution {
    public String rankTeams(String[] votes) {
        int teams = votes[0].length();
        int[][] scores = new int[26][teams+1];
        for(int i=0; i<26; i++) {
            scores[i][0] = i;
        }
        for(String vote : votes) {
            char[] arr =  vote.toCharArray();
            for(int i=0; i<arr.length; i++) {
                scores[arr[i]-'A'][i+1]++;
            }
        }
        Comparator<int[]> comp = new Comparator<int[]>() {
            @Override
            public int compare(int[] i1, int[] i2) {
                for(int i=1; i<=teams; i++) {
                    if(i1[i] != i2[i])
                        return i2[i] - i1[i];
                }
                return i1[0] - i2[0];
            }
        };
        Arrays.sort(scores, comp);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++) {
            sb.append((char) (scores[i][0] + 'A'));
            if(sb.length() == teams)
                break;
        }
        return sb.toString();
    }
}