class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int totalUnits = 0;
        for (int[] box : boxTypes) {
            int numberOfBoxes = box[0];
            int unitsPerBox = box[1];

            if (truckSize == 0) break;

           
            int take = Math.min(numberOfBoxes, truckSize);
            totalUnits += take * unitsPerBox;
            truckSize -= take;
        }

        return totalUnits;
    }
}