class Solution {
    public int maxWidthRamp(int[] nums) {

        int[][] pairs = new int[nums.length][2];
        for(int i = 0; i<nums.length;i++){
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }
        //sort by value
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));


        int max = 0;
        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int currentIndex = pairs[i][1]; 
            max = Math.max(max, currentIndex - minIndex);
            minIndex = Math.min(minIndex, currentIndex);
        }

        return max;
    }
}
