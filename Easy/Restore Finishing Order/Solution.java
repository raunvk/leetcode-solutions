class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> friendSet = new HashSet<Integer>();
     	int[] result = new int[friends.length];
        int j = 0;
        for(int i : friends) {
            friendSet.add(i);
        }
        for(int i : order) {
            if(friendSet.contains(i)) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }
}