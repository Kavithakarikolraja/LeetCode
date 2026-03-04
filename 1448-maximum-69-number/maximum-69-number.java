class Solution {
    public int maximum69Number (int num) {
        
        String a = String.valueOf(num);
        String b = "";
        boolean changes = false; 

        int i;
        
        for(i=0;i<a.length();i++){
            if(a.charAt(i)=='6'&& !changes){
                b+='9';
                changes = true;
                
            }else{
                b += a.charAt(i);
            }
        }

        /*if(i<a.length()-1){
            b += a.substring(i,a.length()-1);
        }*/

       return Integer.parseInt(b); 
    }
}