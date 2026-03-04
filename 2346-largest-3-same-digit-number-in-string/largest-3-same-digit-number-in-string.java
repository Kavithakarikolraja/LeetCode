class Solution {
    public String largestGoodInteger(String num) {
        
    
        int max = Integer.MIN_VALUE;

        for(int i=2;i<num.length();i++){
            
            if(max>Integer.parseInt(String.valueOf(num.charAt(i)))) continue;
            
            int num1 = Integer.parseInt(String.valueOf(num.charAt(i)));
            int num2 = Integer.parseInt(String.valueOf(num.charAt(i-1)));
            int num3 = Integer.parseInt(String.valueOf(num.charAt(i-2)));


            
            if(num1==num2 && num2==num3 && num3==num1){
                 max=num1;
            }
        }

        if(max>Integer.MIN_VALUE){
            return String.valueOf(max).repeat(3);
        }

        return "";
    }
}