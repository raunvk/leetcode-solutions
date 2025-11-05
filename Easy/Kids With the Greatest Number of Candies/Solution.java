class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> result = new ArrayList<>(candies.length);
        for(int c : candies) {
            result.add(c+extraCandies >= max);
        }
        return result;
    }
}