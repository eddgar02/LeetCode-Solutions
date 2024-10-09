class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList<>();
        HashMap<String, Integer> hash = new HashMap<>();
        int i = 0;

        for(String s: strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sw = new String(ch);
            if(!hash.containsKey(sw)){
                hash.put(sw, i);
                i++;
                List<String> ls = new ArrayList<>();
                ls.add(s);
                ret.add(ls);
            } else {
                
                ret.get(hash.get(sw)).add(s);
            }
        
        }
        return ret;

    }
}
