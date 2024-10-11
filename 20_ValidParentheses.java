class Solution {
    public boolean isValid(String s) {
        Stack<Character> stak = new Stack<>();
        char[] ch = s.toCharArray();
        for(int i = 0; i< s.length();i++){
            if(ch[i] == '(' || ch[i] == '[' || ch[i] == '{' ){
                stak.push(ch[i]);
            } else if(!stak.isEmpty()){
                if(ch[i] == ')'){
                    if(stak.peek() == '('){
                        stak.pop();
                    } else {
                        return false;
                    }
                }
                if(ch[i] == ']'){
                    if(stak.peek() == '['){
                        stak.pop();
                    } else {
                        return false;
                    }
                }
                if(ch[i] == '}'){
                    if(stak.peek() == '{'){
                        stak.pop();
                    } else {
                        return false;
                    }
                }

            } else {
                return false;
            }
        }
        return stak.isEmpty();
    }
}
