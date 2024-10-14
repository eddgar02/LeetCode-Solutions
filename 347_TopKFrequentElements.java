class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int i = 0; i<nums.length;i++){
            hash.put(nums[i], hash.getOrDefault(nums[i],0) +1);
        }

        int[][] freq = new int[hash.size()][2];
        int j =0;
        for(int key: hash.keySet()){
            freq[j][0] = key;
            freq[j][1] = hash.get(key);
            j++;
        }
        Arrays.sort(freq, (a,b) -> Integer.compare(b[1],a[1]));
        int[] ret = new int[k];

        for(int i = 0; i< k; i++){
            ret[i] = freq[i][0];
        }
        return ret;

        
    }
}
