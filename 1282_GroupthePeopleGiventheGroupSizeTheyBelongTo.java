class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        List<List<Integer>> ret = new ArrayList<>();
        for(int i  = 0 ; i<groupSizes.length;i++){
            int groupSize = groupSizes[i];

            hm.putIfAbsent(groupSize, new ArrayList<>());

            hm.get(groupSize).add(i);

            if(hm.get(groupSize).size() == groupSize){
                ret.add(hm.get(groupSize));
                hm.put(groupSize, new ArrayList<>());
            }



        }
        return ret;
    }
}
