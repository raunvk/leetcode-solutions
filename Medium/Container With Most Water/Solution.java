class Solution {
    public int maxArea(int[] height) {
        int leftIndex = 0, rightIndex = height.length-1, maxArea = 0;
        while(leftIndex < rightIndex) {
            int minHeight = Math.min(height[leftIndex], height[rightIndex]);
            int area = minHeight * (rightIndex - leftIndex);
            maxArea = Math.max(area, maxArea);
            while(leftIndex<rightIndex && minHeight>=height[leftIndex]) 
                leftIndex++;
            while(leftIndex<rightIndex && minHeight>=height[rightIndex]) 
                rightIndex--;
        }
        return maxArea;
    }
}