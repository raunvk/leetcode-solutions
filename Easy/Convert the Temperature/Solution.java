class Solution {
    public double[] convertTemperature(double celsius) {
        double[] convert = new double[2];
        convert[0] = celsius + 273.15;
        convert[1] = (celsius*1.80) + 32.00;
        return convert;
    }
}