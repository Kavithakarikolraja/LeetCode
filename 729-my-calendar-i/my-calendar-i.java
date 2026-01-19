class MyCalendar {
    private TreeMap<Integer, Integer> calendar;

    public MyCalendar() {
        calendar = new TreeMap<>();
    }

    public boolean book(int startTime, int endTime) {
        
        Map.Entry<Integer, Integer> before = calendar.lowerEntry(endTime);

        
        if (before != null && before.getValue() > startTime) {
            return false;
        }

        
        calendar.put(startTime, endTime);
        return true;
    }
}
