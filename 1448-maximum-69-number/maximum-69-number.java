class Solution {
    public int maximum69Number (int num) {
        
        StringBuilder a = new StringBuilder(String.valueOf(num));
        
        

        int i;
        
        for(i=0;i<a.length();i++){
            if(a.charAt(i)=='6'){
                a.setCharAt(i,'9');
                return Integer.parseInt(a.toString());
                

            }
        }
       return Integer.parseInt(a.toString()); 
    }
}