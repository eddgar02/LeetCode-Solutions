class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();


        int i = 0;
        int j = str.length() -1;

        while(i <= str.length()-1 && j >=0){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}
