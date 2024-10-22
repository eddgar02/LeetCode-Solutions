class Solution {
    public int maxUniqueSplit(String s) {
        HashSet<String> mySet = new HashSet<>();

        return mas(mySet, 0, s);
    } 

    public int mas(HashSet<String> set, int index, String s){
        if(index == s.length()){
            return 0;
        }
        int splits = 0;
        for(int i = index + 1; i<=s.length();i++){
            if(!set.contains(s.substring(index, i))){
                set.add(s.substring(index, i));
                splits = Math.max(splits, 1 + mas(set, i, s));
                set.remove(s.substring(index,i));
            }
        }
        return splits;
    }
}
