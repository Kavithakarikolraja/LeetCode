class Solution {
    public String clearDigits(String s) {
        
        StringBuilder a  = new StringBuilder();

        Stack<Character> re = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                if(!re.isEmpty()) {
                    re.pop(); 
                }
            } else {
                re.push(s.charAt(i)); 
            }
        }

        

        while(!re.isEmpty()){
            a.append(re.pop());
        }

        return a.reverse().toString();
    }
}