class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> a = new Stack<>();

        for(char c : s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                a.push(c);
            }
            else{
                if(a.isEmpty()) return false;
                char t = a.pop();
                if((c==')'&& t!='(')||(c==']'&& t!='[')||(c=='}'&& t!='{')) return false;
            }
        }
    return a.isEmpty();
    }

}