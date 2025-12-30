class Solution {
    public int bestClosingTime(String customers) {

        int fine = 0;

        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y') fine++;
        }

        int tempFine = fine;
        int closed = 0;

        for(int j=0;j<customers.length();j++){
            if(customers.charAt(j)=='Y') fine--;
            else fine++;
            if(fine<tempFine){
                tempFine = fine;
                closed = j+1;
            }
        }
      return closed;
    }
}