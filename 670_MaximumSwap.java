class Solution {
    public int maximumSwap(int num) {
        String s = String.valueOf(num);
        char[] c = s.toCharArray();
        int max = num;
        for(int i = 0; i<c.length;i++ ){
            for(int j = 1; j<c.length; j++){
                if(c[j] > c[i]){
                    char[] temp = c.clone();
                    char ten;
                    ten = temp[j];
                    temp[j] = temp[i];
                    temp[i] = ten;
                    String rep = new String(temp);
                    if(Integer.parseInt(rep) > max){
                        max = Integer.parseInt(rep);
                    }

                }
            }
        }
        return max;
    }
}
