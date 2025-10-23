class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

       
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        
        for (int j = 0; j < list2.length; j++) {
            String item = list2[j];
            if (map.containsKey(item)) {
                int sum = map.get(item) + j;
                if (sum < minSum) {
                    result.clear();
                    result.add(item);
                    minSum = sum;
                } else if (sum == minSum) {
                    result.add(item);
                }
            }
        }

        return result.toArray(new String[result.size()]);
    }
}