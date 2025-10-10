class Solution {
    public int calPoints(String[] operations) {
        List<Integer> a = new ArrayList<>();

        for (String op : operations) {
            if (op.equals("C")) {
                if (!a.isEmpty()) {
                    a.remove(a.size() - 1);
                }
            } else if (op.equals("D")) {
                a.add(a.get(a.size() - 1) * 2);
            } else if (op.equals("+")) {
                a.add(a.get(a.size() - 1) + a.get(a.size() - 2));
            } else {
                a.add(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : a) {
            sum += score;
        }

        return sum;
    }
}