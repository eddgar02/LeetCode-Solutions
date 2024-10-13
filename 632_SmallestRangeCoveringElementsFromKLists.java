class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> les = new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));
        int rangeBegin = 0;
        int rangeEnd = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i<nums.size(); i++){
            int value = nums.get(i).get(0);

            les.offer(new int[]{value, i , 0}); //store value, list index, element index,
            max = Math.max(max, value);
        }

        while(les.size() == nums.size()){
            int[] cur = les.poll();
            int min = cur[0];
            int li = cur[1];
            int i = cur[2];

            if(max - min < rangeEnd - rangeBegin){
                rangeBegin = min;
                rangeEnd = max;
            }

            //check if there are more elemnents
            if(i + 1 < nums.get(li).size()){
                int nextValue = nums.get(li).get(i+1);
                les.offer(new int[]{nextValue, li, i+1});
                max = Math.max(max, nextValue);
            }
        }
        return new int[]{rangeBegin, rangeEnd};
    }


}
