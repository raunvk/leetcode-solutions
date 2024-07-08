class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int initialCapacity = capacity;
        for(int i=0; i<plants.length; i++) {
            if(capacity>=plants[i]) {
                steps++;
                capacity -= plants[i];
            }
            else {
                int currentSteps = 1 + (i*2);
                steps += currentSteps;
                capacity = initialCapacity - plants[i];
            }
        }
        return steps;
    }
}