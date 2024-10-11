class Solution {
    public int minSwaps(String s) {
        char[] c = s.toCharArray();
        int countOpen = 0;
        int countClose= 0;
        int swaps = 0;

        for(int i = 0;i<c.length;i++){
            if(c[i] == '['){
                countOpen++;
            }
            if(c[i] == ']'){
                countClose++;
            }

            if(countClose > countOpen){
                swaps++;
                countClose--;
                countOpen++;
            }    
        }
        return swaps;
    }
}
