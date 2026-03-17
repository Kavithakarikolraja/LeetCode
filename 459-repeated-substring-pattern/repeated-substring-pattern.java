class Solution {
    public boolean repeatedSubstringPattern(String s) {


       /* if((s.length()&1)==1){
            return false;
        }
        
        String check ="";
        boolean foundnot = false;
        int length = 2;
        int size = 0;
        
        while(foundnot == false){
            String val1 = s.substring(0,length/2);
            String val2 = s.substring(length/2,length);
            if(val1.equals(val2)){
                size = length/2;
                break;
            }
            length += 2;
        }

         String validate = s.substring(0,length/2);
        
        for(int i=size;i<s.length();i+=size){
            String validate2 = s.substring(i,i+size);
            if(!validate2.equals(validate)){
                return false;
            }
        }

        return true;*/
         String doubled = s + s;
        return doubled.substring(1, doubled.length() - 1).contains(s);

    }
}