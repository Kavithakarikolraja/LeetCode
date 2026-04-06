class Solution {
    public String decodeString(String s) {
        Stack<String> a = new Stack<>();
        int pos = 0;

        while(pos < s.length()) {
            if(s.charAt(pos) == '[') {
                a.push("[");
                pos++;
            } 

            StringBuilder temp_s = new StringBuilder();
            if(Character.isLetter(s.charAt(pos))) {
                while(pos < s.length() && Character.isLetter(s.charAt(pos))) {
                    temp_s.append(s.charAt(pos));
                    pos++;
                }
                 if(temp_s.length()>0) {
                    a.push(temp_s.toString());
                }
            }

            StringBuilder temp_n = new StringBuilder();
            if(pos < s.length() && Character.isDigit(s.charAt(pos))) {
                while(pos < s.length() && Character.isDigit(s.charAt(pos))) {
                    temp_n.append(s.charAt(pos));
                    pos++;
                }
                if(temp_n.length()>0) {
                    a.push(temp_n.toString());
                }
            }

            if(pos < s.length() && s.charAt(pos) == ']') {
                String res = "";
                while(!a.peek().equals("[")) {
                    res = a.pop() + res;
                }
                a.pop(); 
                int repeat_count = Integer.parseInt(a.pop());
                res = res.repeat(repeat_count);
                a.push(res);
                pos++;
            }
        }

        StringBuilder result = new StringBuilder();
        while (!a.isEmpty()) {
            result.insert(0, a.pop());
        }
        return result.toString(); 
    }  
}
