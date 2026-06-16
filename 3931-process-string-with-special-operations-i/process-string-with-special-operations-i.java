class Solution {
    public String processStr(String s) {
        
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i))) 
            {
                sb.append(String.valueOf(s.charAt(i)));
            }
            else
            {
                if(sb.length()>=1 && s.charAt(i)=='*') 
                {
                    sb.deleteCharAt(sb.length()-1);
                }

                else if(s.charAt(i)=='#')
                {
                    sb.append(sb.toString());
                }

                else
                {
                    sb.reverse();
                }
            }
        }

        return sb.toString();
    }
}