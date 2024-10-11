class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int find = times[targetFriend][0];
        PriorityQueue<int[]> leavingQueue = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0])); //ascending order -> lowest is at top of heap children are > parent
        PriorityQueue<Integer> availableChair = new PriorityQueue<>();

        for(int i = 0; i<times.length;i++) availableChair.add(i);

        Arrays.sort(times, (a,b) -> Integer.compare(a[0], b[0]));

        for(int i =0;i<times.length;i++){
            int arrivalTime = times[i][0];

            while(!leavingQueue.isEmpty() && leavingQueue.peek()[0] <= arrivalTime){
                availableChair.add(leavingQueue.poll()[1]);
            }

            int chair = availableChair.poll(); //assign min chair 

            if(times[i][0] == find){
                return chair;
            }

            int[] leave = {times[i][1], chair}; //array of [leavint time, chair occupied]
            leavingQueue.add(leave);


        }
        return -1;


    }
}
