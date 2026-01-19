class MyCalendar {
    private List<int[]> bookings;
    public MyCalendar() {
        bookings = new ArrayList<>();
    }
    
    public boolean book(int startTime, int endTime) {
        
        for(int[] b : bookings){
            int s = b[0],e=b[1];
            if(startTime<e && endTime>s){
                return false;
            }
        }
         bookings.add(new int[]{startTime, endTime});
        return true;

    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */