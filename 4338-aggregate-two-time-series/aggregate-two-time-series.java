import java.util.*;

class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
       
        int ind1 = 0, ind2 = 0;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp;

        while (ind1 < series1.length && ind2 < series2.length) {
            if (series1[ind1][0] < series2[ind2][0]) {
                temp = new ArrayList<>();
                temp.add(series1[ind1][0]);
                temp.add(series1[ind1][1]+series2[ind2][1]);
                result.add(new ArrayList<>(temp));
                ind1++;
            }
            else if(series1[ind1][0] == series2[ind2][0])
            {
               temp = new ArrayList<>();
                temp.add(series1[ind1][0]);
                temp.add(series1[ind1][1]+series2[ind2][1]);
                result.add(new ArrayList<>(temp));
                ind1++;
                ind2++; 
            }
            
            else {
               
                temp = new ArrayList<>();
                temp.add(series2[ind2][0]);
                temp.add(series1[ind1][1]+series2[ind2][1]);
                result.add(new ArrayList<>(temp));
                ind2++;
            }
            
        }

        while (ind1 < series1.length) {
            
            temp = new ArrayList<>();
            temp.add(series1[ind1][0]);
            temp.add(series1[ind1][1]);
            result.add(new ArrayList<>(temp));
            ind1++;
            
        }

        while (ind2 < series2.length) {
            temp = new ArrayList<>();
            temp.add(series2[ind2][0]);
            temp.add(series2[ind2][1]);
            result.add(new ArrayList<>(temp));
            ind2++;
           
        }

      return result;
       
    }
}